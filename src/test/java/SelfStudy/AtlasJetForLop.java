package SelfStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AtlasJetForLop {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.atlasglb.com/en/");

       driver.findElement(By.id("rtFromText")).click();
       driver.findElement(By.xpath("//*[text()='ISTANBUL - Turkey']")).click();
        Thread.sleep(2000);
      // driver.findElement(By.id("rtToText")).click();
      // driver.findElement(By.xpath("//*[text()='BAGHDAD - Iraq']")).click();

        driver.findElement(By.cssSelector("[data-border='adult']")).click();
        Thread.sleep(2000);

        int i =1;
        while (i < 5)

        {
            driver.findElement(By.xpath("//div[@class='inc button2 active']")).click();
            i++;
        }





    }
}
