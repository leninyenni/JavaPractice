package seleniumPrograms.actions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import seleniumPrograms.HandlingPopUps.UsingJavaScriptExecutor;
//diff between visibilityOfElementlocated and visibilityof
//https://stackoverflow.com/questions/42038485/visibilityofelementlocated-vs-visibilityof

public class ActionSendKeysArros extends UsingJavaScriptExecutor {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "D:\\Drivers\\updatedchrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com");
        Thread.sleep(5000);
/*		Alert alert= driver.switchTo().alert();
		alert.dismiss();*/
        WebDriverWait driverWait= new WebDriverWait(driver, 10);
        driver.findElement(By.xpath("//button[text()='✕']")).click();
        driver.manage().window().maximize();
        Actions a = new Actions(driver);
        WebElement more = driver.findElement(By.name("q"));
        drawBorder(more, driver);
        a.moveToElement(more).build().perform();
        Thread.sleep(1000);
//the first send keys of arrow down to inititate action
        more.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        more.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        more.sendKeys(Keys.ARROW_DOWN);
        more.sendKeys(Keys.ENTER);
        Actions actions = new Actions(driver);
        /*Thread.sleep(5000);*/
        By yesbutton = By.xpath("//span[text()='Yes']");
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(yesbutton));
        WebElement yes= driver.findElement(yesbutton);
          ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",yes);
        Thread.sleep(500);
       drawBorder(yes,driver);
        actions.moveToElement(yes).build().perform();

        /*WebElement audiomenu = driver.findElement(By.xpath("//a[text()='Audio']"));
        drawBorder(audiomenu, driver);
        a.moveToElement(audiomenu).build().perform();
        Thread.sleep(2000);
        WebElement soundbars = driver.findElement(By.xpath("//a[text()='Soundbars']"));
        drawBorder(soundbars, driver);*/
    }
}
