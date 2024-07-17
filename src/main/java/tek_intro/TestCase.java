package tek_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class TestCase {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://tek-retail-ui.azurewebsites.net/");
        String title = webDriver.getTitle();
        System.out.println(title);

        By SignIn = By.id("signinLink");
        WebElement signin = webDriver.findElement(SignIn);
        signin.click();

       By EnterEmail = By.id("email");
       WebElement enter = webDriver.findElement(EnterEmail);
       enter.sendKeys("baha20@gmail.com");

       By Password = By.id("password");
       WebElement password = webDriver.findElement(Password);
       password.sendKeys("Afghanistan@3030");

       By Login = By.id("LoginBtn");
       WebElement Log = webDriver.findElement(Login);
       Log.click();

        Random random = new Random();
        int x = random.nextInt(1000);
        String email = "baha20@gmail.com";
        String AutoEmail = email + x + " @gmail.com";
        System.out.println(AutoEmail);
        webDriver.quit();


    }
}
