package SelfStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Sorting_String_Columns {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        // we create List to get all this secon clomn on the table
       List<WebElement> firstColList = driver.findElements(By.cssSelector("tr td:nth-child(2)"));

       ArrayList<String> orinigalList = new ArrayList<String>();

       for(int i =0; i < firstColList.size(); i++)
       {
          orinigalList.add (firstColList.get(i).getText());
       }

       ArrayList<String> copiedList = new ArrayList<String>();

       for(int i =0; i < orinigalList.size(); i++)
       {
           copiedList.add (orinigalList.get(i));
       }
        System.out.println("=========================================");
        Collections.sort(copiedList);

        for( String c: copiedList)
        {
            System.out.println(c);
        }
        System.out.println("==============original List==============");

        for( String s: orinigalList)
        {
            System.out.println(s);
        }
    }
}
