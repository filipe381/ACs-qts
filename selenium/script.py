import os
import time
import unittest

import xmlrunner
from selenium import webdriver
from selenium.webdriver.chrome.options import Options
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.ui import WebDriverWait


class GaleriaMusicalTest(unittest.TestCase):
    def setUp(self):
        opts = Options()
        opts.add_argument("--no-sandbox")
        opts.add_argument("--disable-dev-shm-usage")
        opts.add_argument("--disable-gpu")
        opts.add_argument("--window-size=1920,1080")

        remote_url = os.environ.get("SELENIUM_REMOTE_URL")
        if remote_url:
            # Selenium Grid: browser runs on a virtual display so the video
            # sidecar can record it. Do NOT add --headless here.
            self.driver = webdriver.Remote(command_executor=remote_url, options=opts)
        else:
            opts.add_argument("--headless=new")
            chrome_bin = os.environ.get("CHROME_BIN")
            if chrome_bin:
                opts.binary_location = chrome_bin
            chromedriver = os.environ.get("CHROMEDRIVER_BIN", "/usr/bin/chromedriver")
            self.driver = webdriver.Chrome(service=Service(chromedriver), options=opts)

    def tearDown(self):
        self.driver.quit()

    def test_anuncie_flow(self):
        driver = self.driver
        driver.get("https://www.galeriamusical.com.br/")
        wait = WebDriverWait(driver, 10)

        anuncie_link = wait.until(
            EC.presence_of_element_located((By.XPATH, "//a[@href='anunciar.php']"))
        )
        self.assertTrue(anuncie_link.is_displayed())

        anuncie_link.click()
        time.sleep(2)

        target_element = wait.until(
            EC.presence_of_element_located(
                (By.XPATH, "//*[@id='GERAL']/div[2]/div/div[1]/p")
            )
        )
        self.assertTrue(target_element.text.strip())


if __name__ == "__main__":
    unittest.main(
        testRunner=xmlrunner.XMLTestRunner(output="test-reports"),
        failfast=False,
        buffer=False,
        catchbreak=False,
        exit=False,
    )
