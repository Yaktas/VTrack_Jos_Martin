package SelfStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Auto_SuggestiveDropdown {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // enter the letters BENG verify if the Airport option is displayed in the suggestive box.

        driver.get("https://www.ksrtc.in/oprs-web/guest/home.do?h=1");
        driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
        driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
        System.out.println(driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText());

        // we cant get text because element is hidden. so we use java scprit DOM.
        // we use java scprit exucutor.

        JavascriptExecutor  js= ( JavascriptExecutor )driver;

       String scprit = "return document.getElementById(\"fromPlaceName\").value;";
       String text = (String) js.executeScript(scprit);
       System.out.println(text);

       // BENGALURU INTERNATION AIRPORT

       while (!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT"))
       {
           driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
           text = (String) js.executeScript(scprit);
           System.out.println(text);
       }

    }
}
