package tek_intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowser {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();

        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();

    }
}


