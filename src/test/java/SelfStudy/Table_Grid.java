package SelfStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Table_Grid {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("https://www.flashscore.com/football/turkey/super-lig/");

        WebElement table = driver.findElement(By.cssSelector("div[class='table__body']"));
        int rowcount = table.findElements(By.cssSelector("#table-type-1 > div > div.table__body > div.table__row.glib-participant-OvblvwLr")).size();
        int count =  table.findElements(By.cssSelector("div[class='table-type-1 > div > div.table__body > div.table__row.glib-participant-OvblvwLr'] div:nth-child(4)")).size();

        for(int i = 0; i < count; i++)
        {
            System.out.println(table.findElements(By.cssSelector("[class='table-type-1 > div > div.table__body > div.table__row.glib-participant-OvblvwLr'] div:nth-child(4)")).get(i).getText());
        }

    }
}




