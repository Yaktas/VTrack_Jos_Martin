package SelfStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass_Down_Up {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ebay.com");
        Actions a = new Actions(driver);
        // write search box yusuf demirelli capital letter.
        a.moveToElement(driver.findElement(By.id("gh-ac"))).click().keyDown(Keys.SHIFT).sendKeys("yusuf demirelli").build().perform();

        WebElement box=driver.findElement(By.xpath("//*[@id=\"gh-eb-My\"]/div/a[1]"));

        for (int i= 0; i <6; i++) {

            a.moveToElement(box).sendKeys(Keys.ARROW_DOWN).build().perform();
        }
        Thread.sleep(3000);

        a.moveToElement(box).sendKeys(Keys.ENTER).build().perform();
        driver.quit();




    }

}


