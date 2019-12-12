package com.cybertek.tests.d4_basicLocator;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LInktestAndPartialLinkTextTest {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize(); // to open web page full screen
        // LinkText
        driver.get("https://practice.cybertekschool.com/dynamic_loading");

        WebElement link = driver.findElement(By.partialLinkText("Example 6: Loading overlay that disappears and disappears again"));
        WebElement cbt = driver.findElement(By.linkText("Cybertek School"));
        System.out.println(cbt.getText());

        // PARTIAL LINK

        WebElement link6Again = driver.findElement(By.partialLinkText("Example 6"));
        System.out.println(link6Again.getText());
    }
}
