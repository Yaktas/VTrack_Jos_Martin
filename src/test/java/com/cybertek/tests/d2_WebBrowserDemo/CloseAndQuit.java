package com.cybertek.tests.d2_WebBrowserDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CloseAndQuit {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().version("77.0.3865.40").setup();
        WebDriver driver = new ChromeDriver( );
//        driver.get("https://practice.cybertekschool.com/");
//
//       Thread.sleep(1000);
//        // close () -> close the currrent tab / windows
//
//        driver.close();
//
//
        driver.get("http://practice.cybertekschool.com/open_new_tab");
        Thread.sleep(10000);
        driver.close();
        // TODO CLOSE ALL OPEN TABS
        driver.quit();
    }
}





