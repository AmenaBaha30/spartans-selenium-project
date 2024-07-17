package tek_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(4000);
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites");

        By signInLocator = By.id("signingLink");
        WebElement singElement = driver.findElement(signInLocator);
        singElement.click();

        By emailInputLocator = By.id("email");
        By passwordLocator = null;
        WebElement emailInputElement = driver.findElement(passwordLocator);
        emailInputElement.sendKeys(" ");
        passwordLocator = By.id("password");
       // WebElement passwordElement = driver.findElement();

    }
}

     /*
       In Retail App click on then enter email and password
       then click on login
       Push to your repository
        */