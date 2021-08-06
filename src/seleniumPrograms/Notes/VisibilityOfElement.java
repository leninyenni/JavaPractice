package seleniumPrograms.Notes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class VisibilityOfElement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\Drivers\\updatedchrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
        // identify element
        WebElement p=driver.findElement(By.xpath("//h1"));
        //isDisplayed() to check if element visible
        boolean s= p.isDisplayed();
        System.out.println("The return value: " + s);
        driver.close();
    }
}
