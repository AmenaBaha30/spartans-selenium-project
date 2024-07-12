package Account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get(" https://tek-retail-ui.azurewebsites.net/ ");
        driver.manage().window().maximize();
        driver.findElement(By.id("signinLink")).click();
        driver.findElement(By.id("newAccountBtn")).click();
        driver.findElement(By.id("nameInput")).sendKeys("Amena");
        String emailPrefix = " Amena_spartans";
        int number = (int) (Math.random() * 100);
       // String randomEmail = EmailPerfix + number + " @gmail.com";
       // driver.findElement(By.id("emailInput")).sendKeys(randomEmail);
        driver.findElement(By.id("passwordInput")).sendKeys();


    }
}
