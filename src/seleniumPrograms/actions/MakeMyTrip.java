package seleniumPrograms.actions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MakeMyTrip {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "D:\\Drivers\\updatedchrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://www.makemytrip.com/flights");

        driver.findElement(By.xpath("//li[@data-cy='account']")).click();

        WebElement fromCity= driver.findElement(By.id("fromCity"));
        boolean beforeLogin=fromCity.isDisplayed();
        System.out.println(beforeLogin);
        driver.navigate().refresh();

        WebElement fromCityAgain= driver.findElement(By.id("fromCity"));
        boolean afterrefresh=fromCityAgain.isEnabled();
        System.out.println(afterrefresh);


       /* try {
            driver.findElement(By.id("fromCity")).click();
        } catch (ElementClickInterceptedException e) {
            System.out.println("you came to catch block");
            driver.findElement(By.xpath("//li[@data-cy='account']")).click();
            driver.findElement(By.id("fromCity")).click();
        }*/
        WebElement fromTextBox = driver.findElement(By.xpath("//input[@placeholder='From']"));
        fromTextBox.clear();
        fromTextBox.sendKeys("Bangk");
        List<WebElement> allOptions =
                driver.findElements(By.xpath("//div[@class='tt-suggestion']"));
        int count = allOptions.size();
        System.out.println("No. of autosuggestions" + count);
        System.out.println("List of autosuggstions");
        for (int i = 0; i < count; i++) {
            String text = allOptions.get(i).getText();
            System.out.println(text);
        }
        fromTextBox.sendKeys(Keys.ARROW_DOWN);
        fromTextBox.sendKeys(Keys.ARROW_DOWN);
        fromTextBox.sendKeys(Keys.ENTER);
    }
}
