package tek_intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class pop {
    public static void main(String[] args) {
//        EdgeDriver driver = new EdgeDriver();
//        driver.manage().window().maximize();
//        String title = driver.getTitle();
//        System.out.println(title);
//        driver.quit();
//        driver.get("https://google.com");

        String browserType = "firefox";
        WebDriver driver;

        if (browserType.equals("Chrome")) {
            driver = new ChromeDriver();

        } else if (browserType.equals("edge")) {
            driver = new EdgeDriver();

        } else if (browserType.equals("firefox")) {
            driver = new FirefoxDriver();

        } else if (browserType.equals("Safari")) {
            driver = new SafariDriver();

            // }else throw new RuntimeException("wrong browsertype");

        }
    }

}


