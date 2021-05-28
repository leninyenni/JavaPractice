package seleniumPrograms.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class ActiveElement {

    public static void main(String[] args) throws InterruptedException, AWTException {


        System.setProperty("webdriver.chrome.driver",
                "D:\\Drivers\\chromedriver.exe");
        //
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.switchTo().activeElement().sendKeys("Sachin");
        Thread.sleep(3000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(2000);

        /*robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);*/
        driver.switchTo().activeElement().click();
        Thread.sleep(1000);
        driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
        driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
        driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
        driver.switchTo().activeElement().sendKeys(Keys.ENTER);

        /*Actions actions= new Actions(driver);
        driver.switchTo().activeElement();
        actions.sendKeys(Keys.DOWN).build().perform();
        Thread.sleep(500);
        actions.sendKeys(Keys.DOWN).build().perform();
        Thread.sleep(500);
        actions.sendKeys(Keys.ENTER).build().perform();*/
    }
}
