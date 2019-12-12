package com.cybertek.tests.d4_basicLocator;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassLocatorTest {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize(); // to open web page full screen

        driver.get("https://practice.cybertekschool.com/sign_up");

        WebElement home = driver.findElement(By.className("nav-link"));
        home.click();

        driver.get("https://practice.cybertekschool.com/multiple_buttons");

        WebElement title = driver.findElement(By.className("h3"));

        System.out.println(title);

    }
}
