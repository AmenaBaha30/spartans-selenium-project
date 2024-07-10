package practicepackag;

import org.openqa.selenium.chrome.ChromeDriver;
public class openingBrowser {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
    }
}


