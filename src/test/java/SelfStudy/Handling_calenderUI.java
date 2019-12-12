package SelfStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Handling_calenderUI {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("https://path2usa.com/travel-companions");
        // April 14

        driver.findElement(By.id("travel_date")).click();

        while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']"))
                .getText().contains("May"))
        {
            driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
        }


        List<WebElement> dates = driver.findElements(By.className("day"));

        // Grab the comman attribute and find element here is "day"
        int count = driver.findElements(By.className("day")).size();

        for (int i = 0; i < count; i++) {
            String text = driver.findElements(By.className("day")).get(i).getText();
            if (text.equalsIgnoreCase("14")) {
                driver.findElements(By.className("day")).get(i).click();
                break;
            }
        }

    }
}