package com.cybertek.tests.d3_webelement_class;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**Verify URL changed
   open browser
   go to http://practice.cybertekschool.com/forgot_password
   enter any email
   click on Retrieve password
   verify that url changed to http://practice.cybertekschool.com/email_sent
  *
  */
public class VerifiyURLChange {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver  = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/forgot_password");
     // enter any email
        WebElement emailInput = driver.findElement(By.name("email"));
     // senkeys --> enter giving text
        emailInput.sendKeys("josephmartinusa@gmail.com");
     // click on Retrieve password
        WebElement retrievePassword = driver.findElement(By.id("form_submit"));

        retrievePassword.click();
        String expectedUrl = driver.getCurrentUrl();
        String actualUrl = driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)) {
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
      // close the browser
      driver.quit();
    }

}
