package com.cybertek.tests.VtrackTest;

import com.cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class testForVtrack {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com");
        driver.findElement(By.name("_username")).sendKeys("user24");
        driver.findElement(By.name("_password")).sendKeys("UserUser12");
        driver.findElement(By.name("_submit")).click();
    }




}