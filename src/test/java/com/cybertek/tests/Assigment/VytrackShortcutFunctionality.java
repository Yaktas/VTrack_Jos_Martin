package com.cybertek.tests.Assigment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VytrackShortcutFunctionality {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://qa2.vytrack.com");
        driver.findElement(By.name("_username")).sendKeys("salesmanager134");
        driver.findElement(By.name("_password")).sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).click();
        Thread.sleep(2000);

        driver.findElement(By.className("fa-share-square")).click();
        driver.findElement(By.linkText("See full list")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//tr[21]//td[1]//a[1]")).click();
        driver.findElement(By.xpath("//i[@class='fa-share-square']")).click();
    }
}
