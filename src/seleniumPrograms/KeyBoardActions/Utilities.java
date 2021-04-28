package seleniumPrograms.KeyBoardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utilities {

    public static WebDriver driver;

    Utilities(String browser) {

        if (browser=="chrome")
        {
            System.setProperty("webdriver.chrome.driver",
                    "D:\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        if (browser=="firefox")
        {
            System.setProperty("webdriver.gecko.driver",
                    "D://Drivers//geckodriver.exe");
            driver = new FirefoxDriver();
        }

    }

    By label1 = By.id("_dKg");
    By label2 = By.id("_aKg");
    By label3 = By.id("_cKg");
    By label4 = By.id("_bKg");

    public static void openBrowser(String url) {
        driver.get(url);
    }

    public static void MaximizeBrowser() {
        driver.manage().window().maximize();
    }

    public static void QuitBrowser() { driver.quit();
    }
}
