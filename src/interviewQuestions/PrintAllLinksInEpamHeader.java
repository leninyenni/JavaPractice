package interviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PrintAllLinksInEpamHeader {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Puts a Implicit wait, Will wait for 10 seconds before throwing exception
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.epam.com/");
        List<WebElement> listOfLnks = driver.findElements(By.xpath("//ul[@class='top-navigation__row']/li/span/a"));
        for (WebElement webElement: listOfLnks)
        {
            System.out.println(webElement.getAttribute("href"));
        }
        List<WebElement> links_career= driver.findElements(By.xpath("(//div[@class='top-navigation__flyout'])[3]/ul/li/a"));
        for (WebElement links: links_career)
        {
            System.out.println(links.getAttribute("href"));
        }

    }
}
