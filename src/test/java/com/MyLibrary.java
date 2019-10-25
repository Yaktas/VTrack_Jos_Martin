package com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyLibrary {
    public static void main(String[] args) throws InterruptedException{


        // to connect chrome driver
//     WebDriverManager.chromedriver().version("77.0.3865.40").setup();
     WebDriverManager.chromedriver().setup();
     WebDriver driver = new ChromeDriver();

    // to connect to website using get method
     driver.get("http://amazon.com");

    // when we use sleep method we need to throw expection in main method
    // sleep method gives time delay

        Thread.sleep(3000);

    }
}

