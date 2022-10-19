package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.SmartUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Malika_TS51_64 extends  TestBase {



    @Test(priority = 1)
    public void test1 () throws InterruptedException {

        SmartUtil.loginUser150(driver);

            WebElement activitiesBtn = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/a/span"));
            activitiesBtn.click();
            Thread.sleep(3000);

            WebElement calendar = driver.findElement(By.xpath("//span[.='Calendar Events']"));
            calendar.click();
            Thread.sleep(3000);

            WebElement clickCalendar = driver.findElement(By.xpath("//a[@class='btn main-group btn-primary pull-right ']"));
            clickCalendar.click();
            Thread.sleep(3000);

            WebElement selectRepeat = driver.findElement(By.xpath("//label[normalize-space()='Repeat']"));
            Thread.sleep(3000);
            selectRepeat.click();

            WebElement checkNumber = driver.findElement(By.xpath("(//input[@value='1'])[2] "));

            String validateNumber = checkNumber.getAttribute("value");
            System.out.println("validateNumber = " + validateNumber);

            Thread.sleep(3000);
            WebElement deleteNumber = driver.findElement(By.xpath("(//input[@value='1'])[2]"));
            deleteNumber.clear();


            WebElement errorMsg = driver.findElement(By.xpath("(//span[.='This value should not be blank.'])[3]"));

            Assert.assertTrue(errorMsg.isDisplayed());
            System.out.println("errorMsg.getText() = " + errorMsg.getText());



        }

        @Test (priority = 2)

    public void test2() throws InterruptedException {
        SmartUtil.loginStoreManager99(driver);

            WebElement activitiesBtn = driver.findElement(By.xpath("//div[@id='main-menu']/ul/li[5]/a/span"));
            activitiesBtn.click();
            Thread.sleep(3000);

            WebElement calendar = driver.findElement(By.xpath("//span[.='Calendar Events']"));
            calendar.click();
            Thread.sleep(3000);

            WebElement clickCalendar = driver.findElement(By.xpath("//a[@title='Create Calendar event']"));
            clickCalendar.click();
            Thread.sleep(3000);

            WebElement selectRepeat = driver.findElement(By.xpath("//input[@id='recurrence-repeat-view462']"));
            Thread.sleep(3000);
            selectRepeat.click();

            WebElement checkNumber = driver.findElement(By.xpath("(//input[@class='recurrence-subview-control__number'])[1]"));


            String validateNumber = checkNumber.getAttribute("value");
            System.out.println("validateNumber = " + validateNumber);

            Thread.sleep(3000);
            WebElement deleteNumber = driver.findElement(By.xpath("(//input[@class='recurrence-subview-control__number'])[1]"));
            deleteNumber.clear();

            WebElement errorMsg = driver.findElement(By.xpath("//span[@style='top: 445px; left: 791.667px;']/span"));

            Assert.assertTrue(errorMsg.isDisplayed());
            System.out.println("errorMsg.getText() = " + errorMsg.getText());

        }

        @Test (priority = 3)

    public void test3() throws InterruptedException {
        SmartUtil.loginSalesManager267(driver);

            WebElement activitiesBtn = driver.findElement(By.xpath("(//a[@class='unclickable'])[5]//span"));
            activitiesBtn.click();
            Thread.sleep(3000);

            WebElement calendar = driver.findElement(By.xpath("//span[.='Calendar Events']"));
            calendar.click();
            Thread.sleep(3000);

            WebElement clickCalendar = driver.findElement(By.xpath("//div[@class='btn-group']/a"));
            clickCalendar.click();
            Thread.sleep(3000);

            WebElement selectRepeat = driver.findElement(By.xpath("//input[@id='recurrence-repeat-view425']"));
            Thread.sleep(3000);
            selectRepeat.click();

            WebElement checkNumber = driver.findElement(By.xpath("(//input[@class='recurrence-subview-control__number'])[1]"));


            String validateNumber = checkNumber.getAttribute("value");
            System.out.println("validateNumber = " + validateNumber);

            Thread.sleep(3000);
            WebElement deleteNumber = driver.findElement(By.xpath("(//input[@class='recurrence-subview-control__number'])[1]"));
            deleteNumber.clear();

            WebElement errorMsg = driver.findElement(By.xpath("(//span[.='This value should not be blank.'])[1]"));

            Assert.assertTrue(errorMsg.isDisplayed());
            System.out.println("errorMsg.getText() = " + errorMsg.getText());

        }



    }


