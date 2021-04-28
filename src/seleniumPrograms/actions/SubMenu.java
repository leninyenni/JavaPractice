package seleniumPrograms.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import seleniumPrograms.HandlingPopUps.UsingJavaScriptExecutor;

public class SubMenu extends UsingJavaScriptExecutor {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "D:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com");
        Thread.sleep(5000);
/*		Alert alert= driver.switchTo().alert();
		alert.dismiss();*/
        driver.findElement(By.xpath("//button[text()='✕']")).click();
        driver.manage().window().maximize();
        Actions a = new Actions(driver);
        WebElement electronicsmenu = driver.findElement(By.xpath("//div[text()='Electronics']"));
        drawBorder(electronicsmenu, driver);
        a.moveToElement(electronicsmenu).build().perform();
        Thread.sleep(2000);
        WebElement audiomenu = driver.findElement(By.xpath("//a[text()='Audio']"));
        drawBorder(audiomenu, driver);
        a.moveToElement(audiomenu).build().perform();
        Thread.sleep(2000);
        WebElement soundbars = driver.findElement(By.xpath("//a[text()='Soundbars']"));
        drawBorder(soundbars, driver);
        soundbars.click();
        Thread.sleep(5000);
        driver.close();


    }
}

