package tek_intro.lab_session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {
        public static void main(String[] args)
                throws InterruptedException { WebDriver driver = new ChromeDriver();
            Thread.sleep(5000); driver.manage().window().maximize();
            driver.get("https://retail.tekschool-students.com/");
            By signInLocator = By.id("signInLink");
            WebElement signInElement = driver.findElement(signInLocator);
            signInElement.click();
            By createNewAccount = By.id("newAccountBtn");
            WebElement createNewAccountElement = driver.findElement(createNewAccount);
            createNewAccountElement.click(); By nameLocator = By.id("nameInput");
            WebElement nameElement = driver.findElement(nameLocator);
            nameElement.sendKeys("ABC");
            By emailInputLocator = By.id("emailInput");
            WebElement emailInputElement = driver.findElement(emailInputLocator);
            emailInputElement.sendKeys("ABC2020@gmail.com");
            By passwordLocator = By.id("passwordInput");
            WebElement passwordElement = driver.findElement(passwordLocator);
            passwordElement.sendKeys("@12345World");
            By confirmPasswordLocator = By.id("passwordInput");
            WebElement confirmPasswordElement = driver.findElement(confirmPasswordLocator);
            confirmPasswordElement.sendKeys("12345world");
            By signUpLocator = By.id("newAccountBtn");
            WebElement signUpElement = driver.findElement(signUpLocator);
            signUpElement.click();
            By loginBtnLocator = By.id("loginBtn");
            WebElement loginBtnElement = driver.findElement(loginBtnLocator);
            loginBtnElement.click();
            driver.quit();
        }
}
/*
    In Retail app, click on sign in then click on Create new Account
    then fill up the form and sign up. Expectation is to Create new Account.
    once account created make sure profile picture is displayed. (isDisplayed)
    And print result of isDisplayed method.
 */