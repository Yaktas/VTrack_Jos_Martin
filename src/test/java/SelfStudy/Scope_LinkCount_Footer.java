package SelfStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Scope_LinkCount_Footer {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // give me the counts of the link. Every link has Tag a.

        driver.get("http://practice.cybertekschool.com/");
        System.out.println(driver.findElements(By.tagName("a")).size());

        // get the link count on Footer section
        driver.get("https://ebay.com");

        WebElement footerdriver = driver.findElement(By.id("hlGlobalFooter"));

        System.out.println(footerdriver.findElements(By.tagName("a")).size());

        // Count just one cloumn of fotter
        WebElement coloumndriver = footerdriver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
        System.out.println(coloumndriver.findElements(By.tagName("a")).size());

        // click on each link check is the page opening.
        for (int i = 1; i < coloumndriver.findElements(By.tagName("a")).size(); i++) {
            String clicklinkCommand = Keys.chord(Keys.COMMAND, Keys.ENTER);
            coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clicklinkCommand);

        }

        Set<String> abc = driver.getWindowHandles();
        Iterator<String> it = abc.iterator();


        while (it.hasNext())                    // has next tells us next index present or not.
        {
            driver.switchTo().window(it.next());    // it next move next index.
            System.out.println(driver.getTitle());
        }


    }
}
