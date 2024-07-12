package Account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TekRetailAccount {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://tek-retail-ui.azurewebsites.net/");
        driver.manage().window().maximize();
        driver.findElement(By.id("signinLink")).click();
        driver.findElement(By.id("newAccountBtn")).click();
        driver.findElement(By.id("nameInput")).sendKeys("Amena");
        String emailPrefix = "Amena_spartans";
        int number = (int) (Math.random() * 100);
        String randomEmail = emailPrefix + number + "@gmail.com";
        driver.findElement(By.id("emailInput")).sendKeys(randomEmail);
        driver.findElement(By.id("passwordInput")).sendKeys("Amena1212$");
        driver.findElement(By.id("confirmPasswordInput")).sendKeys("Amena1212$");
        driver.findElement(By.id("signupBtn")).click();
        Thread.sleep(3000);
        boolean isProfileImageDisplayed = driver.findElement(By.id("profileImage")).isDisplayed();

        if (isProfileImageDisplayed){
            System.out.println("Test passed and account has been successfully created!");
        }else {
            System.out.println("Test failed and account has not been created successfully");
        }
        driver.quit();
    }
}