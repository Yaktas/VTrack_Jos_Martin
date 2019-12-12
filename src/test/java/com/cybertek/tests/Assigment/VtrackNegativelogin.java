package com.cybertek.tests.Assigment;

import com.cybertek.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VtrackNegativelogin {

    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com");
        driver.findElement(By.name("_username")).sendKeys("User25");
        driver.findElement(By.name("_password")).sendKeys("UserUser124");
        driver.findElement(By.id("_submit")).click();

       String Actual = driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/div[1]/div")).getText();
       String Expected = "Invalid user name or password.";

       if ( Actual.equals(Expected)) {
           System.out.println("PASS");
       } else{
               System.out.println("FAIL");
           }
       }
    }

