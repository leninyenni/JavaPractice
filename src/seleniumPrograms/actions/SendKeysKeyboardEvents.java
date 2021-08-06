package seleniumPrograms.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysKeyboardEvents {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "D:\\Drivers\\updatedchrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.switchTo().activeElement().sendKeys("sachin");
        Thread.sleep(1000);
        driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        driver.switchTo().activeElement().sendKeys(Keys.ENTER);
    }
}
