package SelfStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticDropDown_RadioButton {

    public static void main(String[] args) throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.spicejet.com/");

        WebElement city =  driver.findElement(By.cssSelector("[id='ctl00_mainContent_ddl_originStation1_CTXT']"));
        city.click();
        city.sendKeys("amd" + Keys.ENTER);
        Thread.sleep(2000);
        WebElement city2 =  driver.findElement(By.cssSelector("[id='ctl00_mainContent_ddl_destinationStation1_CTXT']"));
        city2.click();
        city2.sendKeys("knu" + Keys.ENTER);

        driver.findElement(By.name("ctl00$mainContent$view_date1")).click();
        driver.findElement(By.name("ui-state-default ui-state-highlight")).click();

      //  driver.close();





















    }
}
