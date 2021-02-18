package seleniumPrograms.HandlingPopUps;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Alert_Promptpopup extends UsingJavaScriptExecutor {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C://Users//91939//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Enter the url
        driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
        // find this button : "Say my name"
        //xpath syntax //tagname[@attributename="attribute value"]
        /* //--> search for entire dom*/
        WebElement saymyname = driver.findElement(By.xpath("//input[@value='Say my name!']"));
       /* scrollIntoView(saymyname,driver);
        flash(saymyname, driver);
        drawBorder(saymyname, driver);*/
        saymyname.click();
        // Switch to alert pop up
        Alert alert = driver.switchTo().alert();
        Thread.sleep(5000);
        // print the text present on the alert pop up
        System.out.println(alert.getText());
        // enter your name in the text box present on the alert pop up
        alert.sendKeys("Tony");
        Thread.sleep(5000);
        // click on OK button
        alert.accept();
        Thread.sleep(3000);
        // print the text present on the second alert pop up
        System.out.println(alert.getText());
        // click on Cancel button
        alert.accept();
        Thread.sleep(5000);
        driver.close();
    }
}