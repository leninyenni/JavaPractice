package seleniumPrograms.RandomThoughts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class zodiacCompatability {
    WebDriver driver;

    @BeforeTest
    public void launchSite()
    {
        System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        //enter the url
        driver.get("https://www.astrology-zodiac-signs.com/compatibility/aries-aries/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test(dataProvider = "myDataProvider")
    public void checkCompatability(String sign)
    {
    String url ="https://www.astrology-zodiac-signs.com/compatibility/aries-"+sign+"/";
    driver.navigate().to(url);
    String com=driver.findElement(By.xpath("(//h2)[2]")).getText();
        System.out.println(com);

    }

    @DataProvider
    public String[] myDataProvider()
    {
        // Passing 3 set of data and each set contains single value
        return new String[] { "aries", "taurus" };
    }

    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }

}
