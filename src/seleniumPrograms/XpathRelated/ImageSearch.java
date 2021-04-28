package seleniumPrograms.XpathRelated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumPrograms.HandlingPopUps.UsingJavaScriptExecutor;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ImageSearch extends UsingJavaScriptExecutor {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "D:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.switchTo().activeElement().sendKeys("sachin");
        driver.findElement(By.xpath("//*[@name='btnK']")).click();
        driver.findElement(By.xpath("//*[text()='Images']")).click();

    }
}



