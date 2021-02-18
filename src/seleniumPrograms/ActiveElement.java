package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElement {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver",
                "C://Users//91939//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        Thread.sleep(5000);
        driver.switchTo().activeElement().sendKeys("Hey buddy");
        driver.findElement(By.name("btnK")).click();
        Thread.sleep(5000);
        driver.close();
    }
}
