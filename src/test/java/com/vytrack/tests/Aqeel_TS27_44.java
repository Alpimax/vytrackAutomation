package com.vytrack.tests;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Aqeel_TS27_44 {

    WebDriver driver;

    @BeforeMethod
    public void setUptMethod() {
        driver = WebDriverFactory.getDriver("chrome");
//        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://qa2.vytrack.com/user/login");
    }


//    @AfterMethod
//    public void tearDown() {
//        driver.quit();
//    }

    @Test

    public void storeManagerModuleTest() throws InterruptedException {

        WebElement userBox = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        userBox.sendKeys(ConfigurationReader.getProperty("StoreManUsr"));
        Thread.sleep(2000);

        WebElement passportBox = driver.findElement(By.xpath("//input[@type='password']"));
        passportBox.sendKeys(ConfigurationReader.getProperty("password"));
        Thread.sleep(2000);

        WebElement clickLogin = driver.findElement(By.xpath("//button[@id='_submit']"));
        clickLogin.click();
        Thread.sleep(2000);

        List<WebElement> modules = driver.findElements(By.xpath("//span[@class='title title-level-1']"));
        List<String> expectedModules = new ArrayList<>(Arrays.asList("Dashboards", "Fleet", "Customers", "Sales", "Activities", "Marketing", "Reports & Segments", "System"));

        for (int i = 0; i < modules.size(); i++) {
            Assert.assertEquals(modules.get(i).getText(), expectedModules.get(i));
            Assert.assertTrue(modules.get(i).isDisplayed());

        }


    }
    @Test
    public void salesManagerModuleTest() throws InterruptedException {

        WebElement userBox = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        userBox.sendKeys(ConfigurationReader.getProperty("SalesManUsr"));
        Thread.sleep(2000);

        WebElement passportBox = driver.findElement(By.xpath("//input[@type='password']"));
        passportBox.sendKeys(ConfigurationReader.getProperty("password"));
        Thread.sleep(2000);

        WebElement clickLogin = driver.findElement(By.xpath("//button[@id='_submit']"));
        clickLogin.click();
        Thread.sleep(2000);

        List<WebElement> modules = driver.findElements(By.xpath("//span[@class='title title-level-1']"));
        List<String> expectedModules = new ArrayList<>(Arrays.asList("Dashboards", "Fleet", "Customers", "Sales", "Activities", "Marketing", "Reports & Segments", "System"));

        for (int i = 0; i < modules.size(); i++) {
            Assert.assertEquals(modules.get(i).getText(), expectedModules.get(i));
            Assert.assertTrue(modules.get(i).isDisplayed());

        }


    }

    @Test
    public void TruckDriverModuleTest() throws InterruptedException {

        WebElement userBox = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        userBox.sendKeys(ConfigurationReader.getProperty("UserUser"));
        Thread.sleep(2000);

        WebElement passportBox = driver.findElement(By.xpath("//input[@type='password']"));
        passportBox.sendKeys(ConfigurationReader.getProperty("password"));
        Thread.sleep(2000);

        WebElement clickLogin = driver.findElement(By.xpath("//button[@id='_submit']"));
        clickLogin.click();
        Thread.sleep(2000);

        List<WebElement> modules = driver.findElements(By.xpath("//span[@class='title title-level-1']"));
        List<String> expectedModules = new ArrayList<>(Arrays.asList("Fleet", "Customers","Activities", "System"));

        for (int i = 0; i < modules.size(); i++) {
            Assert.assertEquals(modules.get(i).getText(), expectedModules.get(i));
            Assert.assertTrue(modules.get(i).isDisplayed());

        }


    }




}
