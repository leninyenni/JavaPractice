package seleniumPrograms.Notes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElement {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver",
                "D:\\Drivers\\updatedchrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        Thread.sleep(5000);
        driver.switchTo().activeElement().sendKeys("Hey buddy");
       WebElement button=  driver.findElement(By.name("btnK"));
       //using webelement click method
       //button.click();
       //using Javascript
      /*  ((JavascriptExecutor)driver).executeScript("document.getElementById('myElementID').click()");*/
        Thread.sleep(5000);
        driver.close();
    }
}
