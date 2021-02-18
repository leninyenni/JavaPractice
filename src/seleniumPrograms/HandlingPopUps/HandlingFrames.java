package seleniumPrograms.HandlingPopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames extends UsingJavaScriptExecutor {
    public static WebDriver driver;
    public static WebElement element;

    public static void highLighterMethod(WebDriver driverObject, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driverObject;
        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
    }

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C://Users//91939//drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://jqueryui.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement radiobox = driver.findElement(By.linkText("Checkboxradio"));
        highLighterMethod(driver, radiobox);
        flash(radiobox, driver);
        radiobox.click();
        Thread.sleep(3000);
        driver.switchTo().frame(0);
        By by = By.xpath("(//*[contains(@class,'ui-checkboxradio-icon-space')])[2]/preceding-sibling::*");
        WebElement web = driver.findElement(by);
        highLighterMethod(driver, web);
        flash(web, driver);
        web.click();
        Thread.sleep(5000);
        WebElement radioicon = driver.findElement(
                By.xpath("(//*[contains(@class,'ui-checkboxradio-icon-space')])[7]/preceding-sibling::*"));
        highLighterMethod(driver, radioicon);
        flash(radioicon, driver);
        Thread.sleep(5000);
        WebElement radioiconspace = driver.findElement(
                By.xpath("(//*[contains(@class,'ui-checkboxradio-icon-space')])[9]/preceding-sibling::*"));
        highLighterMethod(driver, radioiconspace);
        flash(radioiconspace, driver);
        radioiconspace.click();
        Thread.sleep(5000);
        driver.close();
    }
}