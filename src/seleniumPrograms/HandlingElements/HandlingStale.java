package seleniumPrograms.HandlingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandlingStale {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "D:\\Drivers\\updatedchrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.rediff.com/");
        // identify element
        driver.findElement(By.xpath("//ul[@class='navbarul']/li[2]")).click();
        List<WebElement> links = driver.findElements(By.xpath("//div[@class='secstorybox news topboxheight relative']/h2/a"));
        System.out.println(links.size());
        for (int i = 1; i <= links.size(); i++) {
            //it will give staleelement exception since we are relaunching rediff, links variable gets staled
            //String linksText = links.get(i).getText();
            //System.out.println(linksText);
            //links.get(i).click();
            //handling stale element like below

            String xpathPart1= "//div[@class='secstorybox news topboxheight relative']/h2[";
            String xpathPart2="]/a";
            String actualXPath = xpathPart1+i+xpathPart2;
            String linkText = driver.findElement(By.xpath(actualXPath)).getText();
            System.out.println(linkText);
            driver.findElement(By.xpath(actualXPath)).click();

            driver.get("https://www.rediff.com/");
            driver.findElement(By.xpath("//ul[@class='navbarul']/li[2]")).click();
        }
    }
}
