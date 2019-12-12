package SelfStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildRelation_Xpath {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        driver.findElement(By.xpath("//a[@class='gb_g']/../..")).click();
        driver.findElement(By.xpath("//span[@class='S3Wjs']")).click();

        driver.findElement(By.xpath("//input[@autocomplete='off']/../../../../../../../../../../../../..")).click();


    }
            }
