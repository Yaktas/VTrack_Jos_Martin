package com.cybertek.tests.Assigment;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Vytrack4_TestCases {

    WebDriver driver;


    @BeforeMethod
    public void setup() throws InterruptedException {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://qa1.vytrack.com");
        WebElement username = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        username.sendKeys("storemanager85");
        WebElement password = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        password.sendKeys("UserUser123");
        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Navigate to “Activities -> Calendar Events”
        Actions actions = new Actions(driver);
        // Activities
        WebElement Activities = driver.findElement(By.linkText("Activities"));
        actions.moveToElement(Activities).build().perform();
        //Calender events
         Thread.sleep(5000);
        WebElement calender = driver.findElement(By.xpath("//span[contains(text(),'Calendar Events')]"));
        actions.moveToElement(calender).build().perform();
        calender.click();

    }

    @Test
    public void TesterMeeting() {

      WebElement dots =  driver.findElement(By.xpath("//*[@id=\"oroplatform-header\"]/div[1]/div/div[2]/div/a"));
      Actions actions = new Actions(driver);
      actions.doubleClick(dots).build().perform();
    }

    @Test
    public void TestCase2() {


    }

    @Test
    public void TestCase3() {
        driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/div/div[2]/div/a")).click();
    }

    @Test void TestCase4() {


    }

    @Test void TestCase5() {


    }

    @Test void TestCase6() {


    }

    @Test void TestCase7() {


    }

    @Test void TestCase8() {


    }

    @Test void TestCase9() {


    }
}
