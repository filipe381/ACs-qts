# ACs-qts — Unified Docker Stack

One `docker compose` environment that runs all three tasks:

1. **JMeter** load test (`Script_jmeter.jmx`) with live metrics streamed to **Grafana**.
2. **JUnit** suite (`imcCalculator/`) — 122 tests on JDK 22.
3. **Selenium** UI test (`selenium/script.py`) — headless Chromium.

All three are executed from inside **Jenkins** Pipeline jobs.

---

## Services

| Service | URL | Credentials |
|---|---|---|
| Jenkins | http://localhost:8080 | `admin` / `admin` |
| Grafana | http://localhost:3000 | `admin` / `admin` |
| InfluxDB | http://localhost:8086 (no UI) | no auth |

---

## Bring it up

From the repo root (`c:\faculdade\Qualidade_testes\ACs-qts`):

```powershell
docker compose build
docker compose up -d
```

The first build downloads JDK 22, Maven, JMeter, Chromium and all Jenkins plugins — it takes a few minutes. Subsequent `up -d` calls are instant.

Tail logs while it boots:

```powershell
docker compose logs -f jenkins
```

You can stop the stack at any time with `docker compose down`. Add `-v` to also wipe volumes (resets Jenkins config and InfluxDB data).

---

## Create the three Jenkins jobs

The Jenkinsfiles live under `jenkins/jobs/`. Create them in the Jenkins UI:

1. Log in to http://localhost:8080.
2. **New Item** → name it `jmeter` → **Pipeline** → OK.
3. Scroll to **Pipeline** section → keep "Pipeline script" (not from SCM) → paste the contents of `jenkins/jobs/jmeter.Jenkinsfile` → **Save**.
4. Repeat for `junit` (paste `junit.Jenkinsfile`) and `selenium` (paste `selenium.Jenkinsfile`).

Each job copies its sources from `/workspace/` (the repo is bind-mounted read-only into the Jenkins container by `docker-compose.yml`), so there is no git clone step needed.

---

## Run order (recommended)

1. **junit** — fastest sanity check, 122 tests should pass.
2. **selenium** — exercises the headless Chromium install.
3. **jmeter** — open Grafana in another tab while it runs.

---

## Grafana dashboard

After bring-up, the dashboard is pre-loaded:

- Open http://localhost:3000 → log in → **Dashboards** → "Apache JMeter Dashboard using Core InfluxdbBackendListenerClient".
- Set `application` filter to `galeriamusical` (the value baked into the JMX Backend Listener).
- Trigger the **jmeter** job in Jenkins; live metrics appear within seconds.

Sanity-check that InfluxDB received the database:

```powershell
docker exec -it influxdb influx -execute "SHOW DATABASES"
```

Expect `jmeter` in the list.

---

## What was modified vs. created

**Modified:**
- `Script_jmeter.jmx` — added an `InfluxdbBackendListenerClient` Backend Listener pointing at `http://influxdb:8086/write?db=jmeter`.
- `imcCalculator/pom.xml` — added `maven-surefire-plugin 3.5.2` (required for JDK 22), bumped `junit` to 4.13.2, dropped the unused `junit-jupiter:RELEASE` dep, bumped compiler plugin to 3.13.0.
- `selenium/script.py` — rewritten as a `unittest.TestCase` that runs headless Chromium and emits JUnit XML to `test-reports/`.
- `selenium/requirements.txt` — added `unittest-xml-reporting==3.2.0`.

**Created:**
- `docker-compose.yml`
- `docker/jenkins/{Dockerfile, plugins.txt, casc.yaml}`
- `grafana/provisioning/datasources/influxdb.yml`
- `grafana/provisioning/dashboards/dashboards.yml`
- `grafana/dashboards/jmeter.json` (community dashboard 5496)
- `jenkins/jobs/{jmeter,junit,selenium}.Jenkinsfile`

---

## Troubleshooting

- **Grafana shows "No data" on the JMeter dashboard** — make sure the JMeter job actually ran and that the `application` template variable is set to `galeriamusical`.
- **Jenkins job fails with "jmeter: not found"** — the image build failed silently. Run `docker compose build --no-cache jenkins` and watch for download errors.
- **Selenium fails with "session not created"** — Chromium/chromedriver version mismatch is unlikely (apt installs them as a matched pair), but you can confirm with `docker exec -it jenkins chromium --version` and `chromedriver --version`.
- **Influx port 8086 already in use on host** — comment out the `8086:8086` port mapping in `docker-compose.yml`; Jenkins still reaches InfluxDB via the internal `testnet` network.
- **`docker compose up` hangs on Windows mounting `./` into Jenkins** — Docker Desktop must have the project drive shared (Settings → Resources → File Sharing).
