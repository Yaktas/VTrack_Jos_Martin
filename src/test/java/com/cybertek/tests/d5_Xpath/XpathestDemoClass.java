package com.cybertek.tests.d5_Xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathestDemoClass {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cybertekschool.com");

        WebElement link = driver.findElement(By.xpath("/html/body/nav/ul/li/a"));
        System.out.println(link.getText());




    }
}
