package com.cybertek.tests.BasicNavigationTests;

import com.cybertek.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class NavigationTest {

    public static void main(String[] args) {
     chrome("chrome");
     safari ("safari");
     firefox("firefox");
    }

    public static void chrome(String browserType) {


        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
        String title = driver.getTitle();

        driver.navigate().to("https://etsy.com");
        String title1 = driver.getTitle();

        driver.navigate().back();
        String title2 = driver.getTitle();

        if (title.equals(title2)) {
            System.out.println("PASS " + "GOOGLE title are thesame FOR CHROME");
        } else {
            System.out.println("FAIL " + "GOOGLE title are not thesame");
        }

        driver.navigate().forward();
        String title3 = driver.getTitle();

        if (title1.equals(title3)) {
            System.out.println("PASS " + "ETSY title are thesame FOR CHROME");
        } else {
            System.out.println("FAIL " + "ETSY title are not thesame");
        }
        driver.quit();
    }

    public static void safari(String browserType) {

        WebDriver driver = BrowserFactory.getDriver("safari");
        driver.get("https://google.com");
        String title = driver.getTitle();

        driver.navigate().to("https://etsy.com");
        String title1 = driver.getTitle();

        driver.navigate().back();
        String title2 = driver.getTitle();

        if (title.equals(title2)) {
            System.out.println("PASS " + "GOOGLE title are thesame FOR SAFARI");
        } else {
            System.out.println("FAIL " + "GOOGLE title are not thesame");
        }

        driver.navigate().forward();
        String title3 = driver.getTitle();

        if (title1.equals(title3)) {
            System.out.println("PASS " + "ETSY title are thesame FOR SAFARI");
        } else {
            System.out.println("FAIL " + "ETSY title are not thesame");
        }
        driver.quit();
    }
    public static void firefox(String browserType) {

    WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.get("https://google.com");
    String title = driver.getTitle();

        driver.navigate().to("https://etsy.com");
    String title1 = driver.getTitle();

        driver.navigate().back();
    String title2 = driver.getTitle();

        if (title.equals(title2)) {
        System.out.println("PASS " + "GOOGLE title are thesame FOR FIREFOX");
    } else {
        System.out.println("FAIL " + "GOOGLE title are not thesame");
    }

        driver.navigate().forward();
    String title3 = driver.getTitle();

        if (title1.equals(title3)) {
        System.out.println("PASS " + "ETSY title are thesame FOR FIREFOX");
    } else {
        System.out.println("FAIL " + "ETSY title are not thesame");
    }
        driver.quit();
}

    }

