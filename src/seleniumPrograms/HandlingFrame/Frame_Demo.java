package seleniumPrograms.HandlingFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Frame_Demo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "D:\\Drivers\\updatedchrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://makemytrip.com/");
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println(size);

        driver.findElement(By.linkText("Cancellation")).click();
        WebElement cframe = driver.findElement(By.xpath("//iframe[@id='dlgov']"));
        driver.switchTo().frame(cframe);
        driver.findElement(By.xpath("//input[@id='bookingID']")).sendKeys("abcd");
        driver.findElement(By.xpath("//span//a")).click();
        driver.switchTo().defaultContent(); //this is code u can run it 2 c the error
    }
}
