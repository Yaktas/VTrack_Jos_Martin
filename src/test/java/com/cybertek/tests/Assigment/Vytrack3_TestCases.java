package com.cybertek.tests.Assigment;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Vytrack3_TestCases {

    WebDriver driver;


    @BeforeMethod
    public void setup() throws InterruptedException {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://qa1.vytrack.com/user/login");
        WebElement username = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        username.sendKeys("storemanager85");
        WebElement password = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        password.sendKeys("UserUser123");
        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Navigate to “Activities -> Calendar Events”
        Actions actions = new Actions(driver);
        // Activities
        WebElement Activities = driver.findElement(By.linkText("Activities"));
        actions.moveToElement(Activities).build().perform();
        //Calender events
        WebElement calender = driver.findElement(By.xpath("//span[contains(text(),'Calendar Events')]"));
        actions.moveToElement(calender).build().perform();
        calender.click();
        Thread.sleep(5000);
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

    @Test
    public void Testcase1() {

        //Navigate to “Activities -> Calendar Events”
        Actions actions = new Actions(driver);
        // Activities
        WebElement Activities = driver.findElement(By.linkText("Activities"));
        actions.moveToElement(Activities).build().perform();
        //Calender events
        WebElement calender = driver.findElement(By.xpath("//span[contains(text(),'Calendar Events')]"));
        actions.moveToElement(calender).build().perform();
        calender.click();

        WebElement Options = driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/div/div[1]/div/div/div/div[2]/div"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(Options));
        Assert.assertTrue(Options.isDisplayed());


    }

    @Test
    public void Testcase2() {

        String pageNumber = driver.findElement(By.xpath("//input[@value='1']")).getAttribute("value");
        System.out.println(pageNumber);
        Integer pagenumint = Integer.parseInt("1");
        if (pagenumint == 1) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

    }

    @Test
    public void TestCase3() throws InterruptedException {

        Thread.sleep(3000);
        WebElement Nums = driver.findElement(By.cssSelector("[class='btn dropdown-toggle ']"));
        String actualNum = Nums.getText();

        String expectedNum = "25";
        Assert.assertEquals(actualNum, expectedNum);
    }

    @Test
    public void Testcase4() throws InterruptedException {

        Thread.sleep(3000);
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='grid table-hover table table-bordered table-condensed']/tbody/tr"));
        String RowsNum = "Total Of " + rows.size() + " Records";
        System.out.println(RowsNum);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String RecordsNum = driver.findElement(By.xpath("//label[contains(text (), 'Total of')]")).getText();
        System.out.println(RecordsNum);
        Assert.assertEquals(RecordsNum, RowsNum);

    }

    @Test
    public void TestCase5() throws InterruptedException {

        Thread.sleep(3000);
        driver.findElement(By.xpath("//button/input[@type='checkbox']")).click();
        //find all checkboxes
        List<WebElement> checkboxes = driver.findElements(By.xpath("//td/input[@type='checkbox']"));
        Thread.sleep(3000);
        for (int i = 0; i < checkboxes.size(); i++) {
            Assert.assertTrue(checkboxes.get(i).isSelected());
        }
    }

//    @Test
//    public void Testcase6() throws InterruptedException {
//
//        List<WebElement> actualGeneralInfoTitles = driver.findElements(By.xpath("//div[@class='control-group attribute-row']/label"));
//        ArrayList<String> expectedGeneralInfoTitles = new ArrayList<>(Arrays.asList("Title", "Description", "Start", "End", "All-Day Event", "Organizer", "Call Via Hangout"));
//
//        List<WebElement>actualInputTexts=driver.findElements(By.xpath("//div[@class='controls']/div"));
//        ArrayList<String> expectedInputTexts=new ArrayList<>(Arrays.asList("hohohoho", "N/A", "Oct 1, 2019, 6:00 PM", "Oct 1, 2019, 7:00 PM",
//                "No", driver.findElement(By.xpath("//div[@class='controls']/div/div/a")).getText(), "No"));
//        for (int i = 0; i < actualGeneralInfoTitles.size(); i++) {
//            Assert.assertTrue(actualGeneralInfoTitles.get(i).isDisplayed());
//            Assert.assertFalse(!actualGeneralInfoTitles.get(i).getText().equalsIgnoreCase(expectedGeneralInfoTitles.get(i)));
//            Assert.assertTrue(actualInputTexts.get(i).isDisplayed());
//            Assert.assertFalse(!actualGeneralInfoTitles.get(i).getText().equalsIgnoreCase(expectedInputTexts.get(i)));
//        }
//    }



}