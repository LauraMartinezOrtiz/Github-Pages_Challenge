package com.globant.utils.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public enum BrowserType {
    CHROME {
        @Override
        public WebDriver createDriver() {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            //options.addArguments("--start-maximized");
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver(options);

        }
    },
    EDGE {
        @Override
        public WebDriver createDriver() {
            EdgeOptions options = new EdgeOptions();
            options.addArguments("--headless");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver(options);
        }
    };

    public abstract WebDriver createDriver();
}
