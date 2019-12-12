package SelfStudy;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;


public class Alert_Handling {

    WebDriver driver;
    private JLabel alert;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void Alert() {
        driver.get("https://rahulshettyacademy.com/AutomationPractice");
        driver.findElement(By.id("name")).sendKeys("yusuf");
        driver.findElement(By.cssSelector("[id='alertbtn']")).click();

        driver.switchTo().alert();
        driver.switchTo().alert().accept();


    }
}
