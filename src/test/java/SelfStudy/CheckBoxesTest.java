package SelfStudy;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxesTest {

    WebDriver driver;

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

    // i check that i did not click SeniorCitizenDiscount it was false so test passed.
    @Test
    public void checkboxes() {
    driver.get("https://spicejet.com");
    Assert.assertFalse(driver.findElement(By.cssSelector("[id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
    }

    @Test // this test i click the SeniorCitizenDiscount use assert true so it was right test passed.
    public void checkboxes1() {
        driver.get("https://spicejet.com");
        driver.findElement(By.cssSelector("[id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("[id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
    }

}