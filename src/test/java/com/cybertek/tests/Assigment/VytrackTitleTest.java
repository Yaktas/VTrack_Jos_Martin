package com.cybertek.tests.Assigment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VytrackTitleTest {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://qa2.vytrack.com");
        driver.findElement(By.name("_username")).sendKeys("User1");
        driver.findElement(By.name("_password")).sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).click();
        WebElement getTitle = driver.findElement(By.className("dropdown-toggle"));
        System.out.println(getTitle.getText());
    }
}
