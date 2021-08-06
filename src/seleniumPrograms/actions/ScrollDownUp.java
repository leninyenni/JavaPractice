package seleniumPrograms.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollDownUp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "D:\\Drivers\\updatedchrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Creating an object 'action'
        Actions action = new Actions(driver);
        // open SoftwareTestingMaterial.com
        driver.get("https://www.softwaretestingmaterial.com");
        // sleep for 3secs to load the page
        Thread.sleep(3000);
        // SCROLL UP
       // action.sendKeys(Keys.PAGE_DOWN).build().perform();
        // driver.close();
//scroll to bottom using javascriptexecutor
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");

        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");

    }
}
