package com.vytrack.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SmartUtil {
    public static void loginUser150(WebDriver driver){
        WebElement username1 = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        username1.sendKeys(ConfigurationReader.getProperty("username1"));
        WebElement userPassword = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        userPassword.sendKeys(ConfigurationReader.getProperty("password"));
        WebElement loginBtn = driver.findElement(By.xpath("//button[@class='btn btn-uppercase btn-primary pull-right']"));
        loginBtn.click();

    }

    public static void loginStoreManager99(WebDriver driver){
        WebElement username2 = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        username2.sendKeys(ConfigurationReader.getProperty("username2"));
        WebElement userPassword = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        userPassword.sendKeys(ConfigurationReader.getProperty("password"));
        WebElement loginBtn = driver.findElement(By.xpath("//button[@class='btn btn-uppercase btn-primary pull-right']"));
        loginBtn.click();
    }

    public static void loginSalesManager267(WebDriver driver){
        WebElement username3 = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        username3.sendKeys(ConfigurationReader.getProperty("username3"));
        WebElement userPassword = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        userPassword.sendKeys(ConfigurationReader.getProperty("password"));
        WebElement loginBtn = driver.findElement(By.xpath("//button[@class='btn btn-uppercase btn-primary pull-right']"));
        loginBtn.click();
    }
}
