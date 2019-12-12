package com.cybertek.tests.Assigment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class GoogleResultTitle {

    public static void main(String[] args) {

        List<String> searchStr = Arrays.asList("Java", "JUnit", "Selenium");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        WebElement search = driver.findElement(By.cssSelector("[name='q']"));

        for (int i = 0; i < searchStr.size(); i++) {
            search.sendKeys(searchStr.get(i));
            search.submit();
            //(search submit means press enter  )
            // we are looking for first green link on a top
            WebElement GreenUrl = driver.findElement(By.tagName("cite"));
            System.out.println(GreenUrl.getText());

            //clicking on first link
            WebElement FirstLink = driver.findElement(By.tagName("h3"));
            FirstLink.click();
            String currentUrl = driver.getCurrentUrl();
            System.out.println("currentUrl = " + currentUrl);
            if (GreenUrl.equals(currentUrl)) {
                System.out.println("PASS");
            } else {
                System.out.println("False");
                // go back at previous page
                driver.navigate().back();
                search = driver.findElement(By.name("q"));
                search.clear();
            }
        }
        driver.quit();
    }

}
