package com.websitename.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class BrowserFactory {

    private static WebDriver driver;

    public static WebDriver getDriver(String browserName) {
        //condition to check which browser to initialize
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + File.separator + "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }
}
