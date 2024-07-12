package Account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(" https://tek-retail-ui.azurewebsites.net/ ");
        driver.manage().window().maximize();

        driver.findElement(By.id("signinLink")).click();
        driver.findElement(By.id("newAccountBtn")).click();
        driver.findElement(By.id("nameInput")).sendKeys("Baha");
        String emailPrefix = "Amena-B";
        int number = (int) (Math.random() * 100);
        String randomEmail = emailPrefix + number + "@gmail.com";
        driver.findElement(By.id("emailInput")).sendKeys(randomEmail);
        driver.findElement(By.id("passwordInput")).sendKeys("404040Ab@");
        driver.findElement(By.id("confirmPasswordInput")).sendKeys("404040Ab@");
        driver.findElement(By.id("signupBtn")).click();
        Thread.sleep(3000);
        boolean isDisplayed = driver.findElement(By.id("profileImage")).isDisplayed();

        if (isDisplayed){
            System.out.println("Profile image is displayed");
        } else {
            System.out.println(" Profile image is no displayed");
        }
       // driver.quit();


    }
}
