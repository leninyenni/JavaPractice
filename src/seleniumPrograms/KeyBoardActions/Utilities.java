package seleniumPrograms.KeyBoardActions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utilities {

    public WebDriver driver;

    Utilities() {
        System.setProperty("webdriver.chrome.driver",
                "C://Users//91939//drivers//chromedriver.exe");
        driver = new ChromeDriver();
    }

    By label1 = By.id("_dKg");
    By label2 = By.id("_aKg");
    By label3 = By.id("_cKg");
    By label4 = By.id("_bKg");

    public void openBrowser(String url) {
        driver.get(url);
    }

    public void MaximizeBrowser() {
        driver.manage().window().maximize();
    }

    public void QuitBrowser() { driver.quit();
    }
}
