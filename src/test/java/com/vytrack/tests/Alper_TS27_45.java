package com.vytrack.tests;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Alper_TS27_45 {
    WebDriver driver;

    @BeforeMethod
    public void setUptMethod() {
        driver = WebDriverFactory.getDriver("chrome");
//        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://qa2.vytrack.com/user/login");
    }


    @AfterMethod
    public void tearDown() {
        driver.close();
        BrowserUtils.sleep(1);
        driver.quit();
    }

    @Test
    public void testModel() throws InterruptedException {

        WebElement userName = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        userName.sendKeys(ConfigurationReader.getProperty("UserUsr"));
        Thread.sleep(2000);

        WebElement password = driver.findElement(By.cssSelector("input[id='prependedInput2']"));
        password.sendKeys(ConfigurationReader.getProperty("password"));
        Thread.sleep(2000);

        WebElement clickLogin = driver.findElement(By.xpath("//button[@id='_submit']"));
        clickLogin.click();
        Thread.sleep(2000);

        WebElement help = driver.findElement(By.xpath("//li/a[@class='help no-hash']/i"));
        help.click();
        Thread.sleep(2000);

        WebElement logOut = driver.findElement(By.xpath("//i[@class='fa-caret-down']"));
        logOut.click();
        Thread.sleep(2000);

        WebElement loqOut1 = driver.findElement(By.xpath("//a[.='Logout']"));
        loqOut1.click();


    }

}

