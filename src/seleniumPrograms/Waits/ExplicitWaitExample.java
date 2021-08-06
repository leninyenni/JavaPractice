package seleniumPrograms.Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import seleniumPrograms.HandlingPopUps.UsingJavaScriptExecutor;

public class ExplicitWaitExample extends UsingJavaScriptExecutor {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\updatedchrome\\chromedriver.exe");
        // Start browser
        WebDriver driver = new ChromeDriver();
        // Start application
        driver.get("https://www.flipkart.com");
        //Thread.sleep(5000);
/*		Alert alert= driver.switchTo().alert();
		alert.dismiss();*/
        driver.findElement(By.xpath("//button[text()='✕']")).click();
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[text()='Help Center']")).click();
        /*driver.findElement(By.xpath("//span[text()='Order']")).click();*/

        WebDriverWait wait= new WebDriverWait(driver,5000);
        By orderlinklocator=By.xpath("//span[text()='Order']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(orderlinklocator));
        driver.findElement(orderlinklocator).click();




       /* Actions a = new Actions(driver);
        WebElement electronicsmenu = driver.findElement(By.xpath("//div[text()='Electronics']"));
        drawBorder(electronicsmenu, driver);
        a.moveToElement(electronicsmenu).build().perform();
        //Thread.sleep(2000);
        WebElement audiomenu = driver.findElement(By.xpath("//a[text()='Tablets']"));
        drawBorder(audiomenu, driver);
        a.moveToElement(audiomenu).build().perform();
        //Thread.sleep(2000);
        audiomenu.click();*/

    }

}
