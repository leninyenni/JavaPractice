package seleniumPrograms.Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ImplicitWaitEx {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
        // Opening a browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Loading a URL
        driver.get("https://www.redbus.in/");
        // Locating and typing in From text box.
        WebElement fromTextBox = driver.findElement(By.id("src"));
        fromTextBox.sendKeys("Ban");
        // setting implicit time
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Wait starts:" + new Date());
        System.out.println("Typed Ban");
        // Clicking on first search result
        driver.findElement(By.xpath("//li[@select-id='results[0]']")).click();
        System.out.println("Selected Bangalore");
        System.out.println("Wait ends:" + new Date());
        //Closing browser
        driver.quit();
        System.out.println("browser closed");


    }

}
