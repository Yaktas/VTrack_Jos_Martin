package com.cybertek.tests.d4_basicLocator;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize(); // to open web page full screen

        driver.get("https://practice.cybertekschool.com/sign_up");

        WebElement fullName = driver.findElement(By.name("full_name"));
        fullName.sendKeys("john Doe");

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("johndoe@gmail.com");

        WebElement submitButton = driver.findElement(By.name("wooden_spoon"));

        submitButton.click();

    }

}
