package com.cybertek.tests.D2_WebBrowserDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


   public class GetUrlTitle {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().version("77.0.3865.40").setup();
        // open chrome browser
        WebDriver driver=new ChromeDriver();
        driver.get("http://.cybertekschool.com/");
        // get the title of the page
        String title = driver.getTitle();
        System.out.println("title = " + title);
        // getCurrentUrl(); ---> gets url of this page
        String url = driver.getCurrentUrl();
        System.out.println("url = " + url);
        // getPageSource --> get
        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);
    }
}




