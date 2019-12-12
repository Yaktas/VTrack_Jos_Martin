package com.cybertek.tests.d4_basicLocator;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagNameLocatorDemo {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize(); // to open web page full screen

        driver.get("https://practice.cybertekschool.com/sign_up");

        WebElement fullName = driver.findElement(By.tagName("input"));
        fullName.sendKeys("John Doe");

     //   WebElement email = driver.findElement(By.tagName("input"));
     //   email.sendKeys("johndoe@gmail.com");
     // if is more than one tag name selenim read frist one.
     // to search html we press comman+f to search in to html

        WebElement submitButton = driver.findElement(By.name("wooden_spoon"));

        submitButton.click();

    }
}
