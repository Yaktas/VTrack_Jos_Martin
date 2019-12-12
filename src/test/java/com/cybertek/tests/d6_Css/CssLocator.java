package com.cybertek.tests.d6_Css;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssLocator {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cybertekschool.com/multiple_buttons");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.cssSelector("#disappearing_button"));
        System.out.println(element.getText());
    }
}
