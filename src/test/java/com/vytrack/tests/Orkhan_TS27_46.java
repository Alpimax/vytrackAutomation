package com.vytrack.tests;

import com.vytrack.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Orkhan_TS27_46 {

    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://qa1.vytrack.com/user/login");
    }
    @Test
    public void findPinbarImage() throws InterruptedException {
        WebElement userName = driver.findElement(By.xpath("//input[@name ='_username']"));
        userName.sendKeys("user150");
        WebElement passWord = driver.findElement(By.xpath("//input[@name ='_password']"));
        passWord.sendKeys("UserUser123");
        WebElement submitButton = driver.findElement(By.xpath("//button[@type ='submit']"));
        submitButton.click();
        driver.findElement(By.xpath("//a[text()='Learn how to use this space']")).click();
        Thread.sleep(5000);
        WebElement pinbarImage = driver.findElement(By.xpath("//img[@src='/bundles/oronavigation/images/pinbar-location.jpg']"));
        System.out.println(pinbarImage.isDisplayed()? "Image is displayed": "Image is not displayed");

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
