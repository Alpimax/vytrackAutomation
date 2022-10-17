package com.vytrack.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.function.Function;

public class WebDriverFactory {

    public static WebDriver getDriver(String browserType) {
        switch ((browserType).toLowerCase().trim()) {
            case "chrome": {
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            }
            case "chrome2": {
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver(new ChromeOptions().setHeadless(true));
            }
            case "opera": {
                WebDriverManager.operadriver().setup();
                return new OperaDriver();
            }
            case "firefox": {
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            }
            case "edge": {
                WebDriverManager.edgedriver().setup();
                return new EdgeDriver();
            }
            case "safari": {
                WebDriverManager.safaridriver().setup();
                return new SafariDriver();
            }
            default:
                System.err.println("Given browser type doesn't exist/or not currently supported!");
                return null;
        }

    }
}

