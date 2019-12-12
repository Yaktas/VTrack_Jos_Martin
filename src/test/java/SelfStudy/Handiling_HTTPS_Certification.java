package SelfStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class Handiling_HTTPS_Certification {

    public static void main(String[] args) {


        DesiredCapabilities ch = DesiredCapabilities.chrome();
        ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
        ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);

        // Belongs to your local Browser
        ChromeOptions c = new ChromeOptions();
        c.merge(ch);

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


    }
}
