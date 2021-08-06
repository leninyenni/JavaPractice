package seleniumPrograms.HandlingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StaleElement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "D:\\Drivers\\updatedchrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
        // identify element
        WebElement l = driver.findElement(By.id("gsc-i-id1"));
        l.sendKeys("Selenium");
        //refresh page
        //driver.navigate().refresh();
        //l.sendKeys("Selenium");
        driver.quit();
    }
}
