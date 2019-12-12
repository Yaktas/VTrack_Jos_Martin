package SelfStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAndCssSelector_Google {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");

        // xpath formula:   //tagname[@atribute='value']
        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("antalya");
        // write antalya in thw search area

        //css selector formula ;  //tagname[atribute='value']
        driver.findElement(By.cssSelector("a[data-pid='23']")).click();
        // clik on the gmail icon using Css selector.

        driver.findElement(By.xpath("//a[@class='h-c-header__nav-li-link'] ")).click();






       driver.close();
    }
}
