package com.vytrack.tests;

import com.vytrack.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Isa_TS27_47 {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://qa2.vytrack.com/user/login");


    }
    @Test

    public void VehicleContracts(){

        WebElement userBox = driver.findElement(By.xpath("//input[@id='prependedInput']"));


        WebElement passportBox=driver.findElement(By.xpath("//input[@type='password']"));


        //userBox.sendKeys("user150");
        //userBox.sendKeys("salesmanager267");
        userBox.sendKeys("storemanager97");


        passportBox.sendKeys("UserUser123");

        WebElement loginButton=driver.findElement(By.xpath("//div/button"));

        loginButton.click();

        WebElement fleetMagule =driver.findElement(By.xpath("(//span[@class='title title-level-2'])[4]"));
        fleetMagule.click();




    }
}