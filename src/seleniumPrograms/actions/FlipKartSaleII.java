package seleniumPrograms.actions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import seleniumPrograms.HandlingPopUps.UsingJavaScriptExecutor;

import java.util.List;

public class FlipKartSaleII {
    public static class FlipKartII extends UsingJavaScriptExecutor {
        public static WebDriver driver;

        public static void main(String[] args) throws Exception {
            System.setProperty("webdriver.chrome.driver",
                    "D:\\Drivers\\updatedchrome\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.flipkart.com");
            Thread.sleep(5000);
/*		Alert alert= driver.switchTo().alert();
		alert.dismiss();*/
            driver.findElement(By.xpath("//button[text()='✕']")).click();
            driver.manage().window().maximize();

            for (int i = 4; i <= 7; i++) {
                List<WebElement> listofsections = driver.findElements
                        (By.xpath("//div[@id='container']/div/div[2]/div[" + i + "]/div/div/a"));

                //ways of identifying elements
                //div[@id='container']/div/div/following-sibling::div/descendant::div[3]/descendant::div[2]/a
                Actions a = new Actions(driver);
                for (WebElement e : listofsections) {
                    Thread.sleep(2000);
                    a.moveToElement(e).build().perform();
                    System.out.println(e.getText());
                    drawBorder(e, driver);
                }
            }
        }
    }
}