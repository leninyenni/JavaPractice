package seleniumPrograms.Elementlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TextValidationInBox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\updatedchrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Puts a Implicit wait, Will wait for 10 seconds before throwing exception
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Launch website
        driver.navigate().to("http://www.calculator.net/percent-calculator.html");
        // Maximize the browser
        driver.manage().window().maximize();
        // Enter value 10 in the first number of the percent Calculator
        driver.findElement(By.id("cpar1")).sendKeys("10");
        Thread.sleep(5000);
        // Get the text box from the application
        String result = driver.findElement(By.id("cpar1")).getAttribute("value");
        // Print a Log In message to the screen
        System.out.println(" The Result is " + result);
        driver.findElement(By.name("c3par1")).sendKeys("Lenin");
        String value= driver.findElement(By.name("c3par1")).getAttribute("value");
        System.out.println(value);
        // Close the Browser.
        driver.close();
    }
}
