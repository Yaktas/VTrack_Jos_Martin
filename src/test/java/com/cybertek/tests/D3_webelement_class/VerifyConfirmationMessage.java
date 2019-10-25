package com.cybertek.tests.D3_webelement_class;

import com.cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyConfirmationMessage {

    public static void main(String[] args) {
        /**Verify confirmation message
         open browser
         go to http://practice.cybertekschool.com/forgot_password
         enter any email
         click on Retrieve password
         verify that confirmation message says 'Your e-mail's been sent!'
         *
         */
        //  open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailInput = driver.findElement(By.name("email"));

        String expectedEmail = "josephmartinusa@gmail.com";
        emailInput.sendKeys(expectedEmail);

        String actualEmail = emailInput.getAttribute("value");

        if (expectedEmail.equals(actualEmail)) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
            System.out.println("expectedEmail = " + expectedEmail);
            System.out.println("actualEmail = " + actualEmail);
        }
        // click on Retrieve password
        WebElement retrievePassword = driver.findElement(By.id("form_submit"));
        retrievePassword.click();
        // verifiy confirmation message says 'Your email has been sent!'

        String expectedMessage = "'Your e-mail's been sent!'";
        WebElement messageElement = driver.findElement(By.name("confirmation_message"));
        String actualMessage = messageElement.getText();

        if (expectedMessage.equals(actualMessage)) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
            System.out.println("expectedMessage =" + expectedMessage);
            System.out.println("actualMessage =" + actualMessage);
        }

    }
}
