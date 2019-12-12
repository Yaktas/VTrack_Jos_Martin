package com.cybertek.tests.Assigment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbaySearchTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://ebay.com");
        WebElement search = driver.findElement(By.cssSelector("[id='gh-ac']"));
        search.click();
        search.sendKeys("wooden spoon");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("[type='submit']")).click();
        String countFirst =  driver.findElement(By.cssSelector("[class='srp-controls__count-heading']"))
                            .getText().split(" ")[0].replace(",","");
        int TotalNumberOfResult = Integer.parseInt(countFirst);
        System.out.println("Total Number Of Result " + TotalNumberOfResult);


        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"x-refine__group__0\"]/ul/li/a/span")).click();
        String countEnd =  driver.findElement(By.cssSelector("[class='srp-controls__count-heading']"))
                .getText().split(" ")[0].replace(",","");
        int NumberofResult = Integer.parseInt(countEnd);
        System.out.println("Number of Result " + NumberofResult);

        if (NumberofResult > TotalNumberOfResult) {
            System.out.println("Number of Result Bigger than Total Number Of Result");
        } else{
            System.out.println("Total Number Of Result bigger than Number of Result ");
        }

         driver.navigate().back();
         String text = driver.findElement(By.cssSelector("[id='gh-ac']")).getAttribute("value");
         String expected="wooden spoon";

         if (text.equals(expected)){
             System.out.println("PASS");
         }else{
             System.out.println("FAIL");
         }
       //System.out.println(text.getText());
         driver.navigate().back();
         String searchBox = driver.findElement(By.cssSelector("[id='gh-ac']")).getText();
         System.out.println(searchBox);





    }

    }

