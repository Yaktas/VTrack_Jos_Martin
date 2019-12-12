package SelfStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Handling_Multible_Window_Switch {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS );

        driver.get("https://accounts.google.com/signup");
        driver.findElement(By.xpath("//a[@href=\"https://support.google.com/accounts?hl=en\"]")).click();
        System.out.println(driver.getTitle());
        // this is the parent window titlle but i need child window title.

       Set<String> ids = driver.getWindowHandles();
       //to difine 2 or more diffirent window to save.

        Iterator<String> it =ids.iterator();
        String parentid = it.next();
        String childid = it.next();
        driver.switchTo().window(childid);
        System.out.println(driver.getTitle());

        //swithing back to parent
        driver.switchTo().window(parentid);
        System.out.println("SWITHCING BACK TO PARENT ID");
        System.out.println(driver.getTitle());

    }

}
