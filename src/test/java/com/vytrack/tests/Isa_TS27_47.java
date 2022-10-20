package com.vytrack.tests;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Isa_TS27_47 {
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
        driver.quit();
    }

    @Test

    public void VehicleContractsForTruckDrivers() throws InterruptedException {

        WebElement userBox = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        userBox.sendKeys(ConfigurationReader.getProperty("UserUser"));
        Thread.sleep(2000);

        WebElement passportBox=driver.findElement(By.xpath("//input[@type='password']"));
        passportBox.sendKeys(ConfigurationReader.getProperty("password"));
        Thread.sleep(2000);

        WebElement clickLogin = driver.findElement(By.xpath("//button[@id='_submit']"));
        clickLogin.click();
        Thread.sleep(2000);

        WebElement fleetMagule =driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));



        WebElement vehicleContract=driver.findElement(By.xpath("(//a/span)[5]"));
       // vehicleContract.click();

        Actions actions=new Actions(driver);
        actions.moveToElement(fleetMagule).pause(1000).moveToElement(vehicleContract).build().perform();


//        WebElement messageForTruckDriver=driver.findElement(By.xpath("(//div/div[@class='message'])"));
//
//        String expectedMessage="You do not have permission to perform this action.";
//
//        Assert.assertTrue(messageForTruckDriver.isDisplayed());
//        Assert.assertEquals(messageForTruckDriver.getText(),expectedMessage);


    }
    @Test
    public void VehicleContractsSalesManager() throws InterruptedException {

        WebElement userBox = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        userBox.sendKeys(ConfigurationReader.getProperty("SalesManUsr"));
        Thread.sleep(2000);

        WebElement passportBox=driver.findElement(By.xpath("//input[@type='password']"));
        passportBox.sendKeys(ConfigurationReader.getProperty("password"));
        Thread.sleep(2000);

        WebElement clickLogin = driver.findElement(By.xpath("//button[@id='_submit']"));
        clickLogin.click();
        Thread.sleep(2000);

        WebElement fleetMagule =driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));



        WebElement vehicleContract=driver.findElement(By.xpath("(//a/span)[5]"));
        // vehicleContract.click();

        Actions actions=new Actions(driver);
        actions.moveToElement(fleetMagule).pause(1000).moveToElement(vehicleContract).build().perform();

    }
    @Test
    public void VehicleContractsStoreManager() throws InterruptedException {

        WebElement userBox = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        userBox.sendKeys(ConfigurationReader.getProperty("StoreManUsr"));
        Thread.sleep(2000);

        WebElement passportBox=driver.findElement(By.xpath("//input[@type='password']"));
        passportBox.sendKeys(ConfigurationReader.getProperty("password"));
        Thread.sleep(2000);

        WebElement clickLogin = driver.findElement(By.xpath("//button[@id='_submit']"));
        clickLogin.click();
        Thread.sleep(2000);

        WebElement fleetMagule =driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));



        WebElement vehicleContract=driver.findElement(By.xpath("(//a/span)[5]"));
        // vehicleContract.click();

        Actions actions=new Actions(driver);
        actions.moveToElement(fleetMagule).pause(1000).moveToElement(vehicleContract).build().perform();



    }

}