FROM jenkins/jenkins:lts-jdk21

USER root

ARG JMETER_VERSION=5.6.3
ARG MAVEN_VERSION=3.9.9
ARG JDK22_URL=https://github.com/adoptium/temurin22-binaries/releases/download/jdk-22.0.2%2B9/OpenJDK22U-jdk_x64_linux_hotspot_22.0.2_9.tar.gz

RUN apt-get update && apt-get install -y --no-install-recommends \
        ca-certificates curl unzip git \
        python3 python3-pip python3-venv \
        chromium chromium-driver \
        fonts-liberation \
    && rm -rf /var/lib/apt/lists/*

RUN mkdir -p /opt/java && cd /opt/java \
    && curl -fsSL "$JDK22_URL" -o jdk22.tgz \
    && tar -xzf jdk22.tgz \
    && rm jdk22.tgz \
    && mv jdk-22* jdk-22

RUN curl -fsSL "https://archive.apache.org/dist/maven/maven-3/${MAVEN_VERSION}/binaries/apache-maven-${MAVEN_VERSION}-bin.tar.gz" \
        | tar -xz -C /opt \
    && ln -s /opt/apache-maven-${MAVEN_VERSION} /opt/maven

RUN curl -fsSL "https://archive.apache.org/dist/jmeter/binaries/apache-jmeter-${JMETER_VERSION}.tgz" \
        | tar -xz -C /opt \
    && ln -s /opt/apache-jmeter-${JMETER_VERSION} /opt/jmeter

ENV JAVA_HOME_22=/opt/java/jdk-22
ENV M2_HOME=/opt/maven
ENV PATH="/opt/maven/bin:/opt/jmeter/bin:${PATH}"
ENV CHROME_BIN=/usr/bin/chromium
ENV CHROMEDRIVER_BIN=/usr/bin/chromedriver

COPY plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN jenkins-plugin-cli --plugin-file /usr/share/jenkins/ref/plugins.txt

USER jenkins
