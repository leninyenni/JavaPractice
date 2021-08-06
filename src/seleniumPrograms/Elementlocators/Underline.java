package seleniumPrograms.Elementlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Underline {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\updatedchrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.co.in/?gfe_rd=ctrl&amp;ei=bXAwU8jYN4W6iAf8zIDgDA&amp;gws_rd=cr");

        String cssValue = driver.findElement(By.xpath("//a[text()='हिन्दी']")).getCssValue("text-decoration");
        //String cssValue = driver.findElement(By.xpath("//a[text()='हिन्दी']")).getCssValue("border-bottom");
        System.out.println("Before hovering value : " + cssValue);
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//a[text()='हिन्दी']"))).perform();
        String cssValue1 = driver.findElement(By.xpath("//a[text()='हिन्दी']")).getCssValue("text-decoration");
        System.out.println("After hovering value : " + cssValue1);
        driver.close();

    }
}
