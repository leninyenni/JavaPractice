package seleniumPrograms.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SliderTwo {

        @Test
        public void Test1() throws InterruptedException {
        /*WebDriverManager.chromedriver().setup();*/
                System.setProperty("webdriver.chrome.driver",
                        "C://Users//91939//drivers//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/slider/ZWSP");
                driver.switchTo().frame(driver.findElement(By.xpath(".//*[@class='demo-frame']")));
        WebElement slider=driver.findElement(By.xpath(".//*[@id='slider']/span"));
        Actions actions=new Actions(driver);
        actions.clickAndHold(slider);
        actions.moveByOffset(150, 150);
        actions.build().perform();
        Thread.sleep(5000);
        driver.quit();
    }
}
