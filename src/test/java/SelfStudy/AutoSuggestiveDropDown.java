package SelfStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://jetblue.com");
        WebElement source = driver.findElement(By.cssSelector("[aria-labelledby='city-selector_rnrhdjh8wlabel']"));
        source.clear();
        source.sendKeys("mum");
        Thread.sleep(2000);
        source.sendKeys(Keys.ARROW_DOWN);

    }
}
