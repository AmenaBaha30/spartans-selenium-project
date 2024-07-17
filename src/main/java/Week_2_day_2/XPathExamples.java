package Week_2_day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XPathExamples {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//p[text()='Video Games']")).click();
        driver.findElement(By.xpath("//p[text()='PlayStation 5 Console']")).click();
        driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();

    }
}
