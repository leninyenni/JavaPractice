package seleniumPrograms.RandomThoughts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class VisibleElement {
    public static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\updatedchrome\\chromedriver.exe");
        driver = new ChromeDriver();
        //enter the url
        driver.get("https://www.astrology-zodiac-signs.com/compatibility/aries-aries/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement access= driver.findElement(By.xpath("//a[text()='Accessibility Statement']"));
        boolean displayed= access.isDisplayed();
        boolean present= access.isEnabled();
        System.out.println(displayed);
        System.out.println(present);

        //if style="display:none" then isDisplayed returns false
        WebElement sele= driver.findElement(By.id("sign-selecter"));
        System.out.println(sele.isDisplayed());

        Boolean isPresent = driver.findElements(By.id("sign-selecter")).size() > 0;
        if (isPresent)
        {
            System.out.println("hey buddy element is present in the dom");
        }
    }
}
