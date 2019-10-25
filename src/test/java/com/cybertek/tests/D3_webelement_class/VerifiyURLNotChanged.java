package com.cybertek.tests.D3_webelement_class;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifiyURLNotChanged {
    public static void main(String[] args) {

        /** Verify URL not changed
         open browser
         go to http://practice.cybertekschool.com/forgot_password
         click on Retrieve password
         verify that url did not change
         *
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver  = new ChromeDriver();
        // go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        // save accpewcted url
        String expectedUrl = driver.getCurrentUrl();

        //  click on Retrieve password
        // WebElement --> class thsat represents elements from the webpage
        // findElement--> method used to find element on a page
        // retuns a webelement

        WebElement retrievePassword = driver.findElement(By.id("form_submit"));

        retrievePassword.click();

        // verify that url did not change
        String actualUrl = driver.getCurrentUrl();

        if  (expectedUrl.equals(actualUrl)) {
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
    }
}
