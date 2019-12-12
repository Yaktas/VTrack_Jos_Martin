package SelfStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ScreenShoot_KillingProcess {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://google.com");

//        File source = (( TakesScreenshot).driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(source,new File("/Users/yusufdemirelli/ Desktop.png"));


    }
}
