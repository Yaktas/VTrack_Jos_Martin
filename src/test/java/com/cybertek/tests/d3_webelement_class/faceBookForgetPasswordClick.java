package com.cybertek.tests.d3_webelement_class;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class faceBookForgetPasswordClick {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        //Dimension d = new Dimension(640,480);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://amazon.com");


        //            WebDriver driver = new ChromeDriver();
//        driver.get("https://google.com");
       // driver.findElement(By.name("q")).sendKeys("cybertekschool");
       // driver.get("https://gmail.com");
//        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a")).click();
//        Thread.sleep(3000);
        //driver.findElement(By.id("identifierId")).sendKeys("josephmartinusa@gmail.com");
       // driver.quit();

    }
}
