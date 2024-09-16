package com.globant.utils.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyDriver {

    private final WebDriver driver;

    public MyDriver(String browserName) {
        driver = BrowserType.valueOf(browserName).createDriver();
    }

    public static MyDriver newDriver(String browserName){
        return new MyDriver(browserName);
    }

    public WebDriver getDriver() {
        return this.driver;
    }
}