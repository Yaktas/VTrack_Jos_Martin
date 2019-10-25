package com.cybertek.tests.D3_webelement_class;

        import com.cybertek.tests.utilities.WebDriverFactory;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;

public class faceBookForgetPasswordClick {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // or   WebDriverManager.chromedriver().setup();
        //            WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        driver.findElement(By.id("email")).sendKeys("josephmartinusa@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("iloveyou");
        driver.findElement(By.linkText("Forgot account?")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("josephmartinusa@gmail.com");
        // driver.findElement(By.id("loginbutton")).click(); clicking login botton

        //*[@id="u_0_a"]/div[3]/button   #u_0_a > div:nth-child(3) > input   #u_0_a > div:nth-child(3) > input
        // we went to face book page input email address and password then we click to "Forgot password?" button.

        
}
}
