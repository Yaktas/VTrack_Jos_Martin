package com.cybertek.tests.Assigment;

import com.cybertek.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class testForVtrackPossitiveLogIn {
    public static void main(String[] args) {


        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com");
        driver.findElement(By.name("_username")).sendKeys("User24");
        driver.findElement(By.name("_password")).sendKeys("UserUser123");
        driver.findElement(By.name("_submit")).click();

        String RealUrl = "https://qa2.vytrack.com/";
        String acceptedUrl = "https://qa2.vytrack.com/";

        if (acceptedUrl.equals(RealUrl)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

       driver.close();
    }
}

