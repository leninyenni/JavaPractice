package seleniumPrograms.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseudoElementHandling {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\updatedchrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        Thread.sleep(3000);
        WebElement firstName_text = driver.findElement(By.id("firstName"));
        firstName_text.sendKeys("sachin");
        WebElement lastName_text = driver.findElement(By.id("lastName"));
        firstName_text.sendKeys("tendulkar");
        WebElement email_text = driver.findElement(By.id("userEmail"));
        email_text.sendKeys("sachintendulkar@yahoo.com");
        WebElement element = driver.findElement(By.xpath("//input[@name='gender'][@value='Male']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        Thread.sleep(5000);
        WebElement phone_text= driver.findElement(By.id("userNumber"));
        phone_text.sendKeys("9999999999");

        WebElement dateOfBirth_text= driver.findElement(By.id("dateOfBirthInput"));
       /* executor.executeScript
                ("document.getElementById('dateOfBirthInput').setAttribute('value', '30 Jul 2021')");*/
        dateOfBirth_text.click();
        driver.findElement(By.xpath("(//div[contains(@class,'react-datepicker')][text()='29'])[2]")).click();
       WebElement sports_checkbox= driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
        executor.executeScript("arguments[0].click();", sports_checkbox);
    }
}
