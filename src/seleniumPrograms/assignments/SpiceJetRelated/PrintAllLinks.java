package seleniumPrograms.assignments.SpiceJetRelated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class PrintAllLinks {
    public WebDriver driver;

    @Test
    public void f() {
/*   String s[]=new String[15];
   List<String> s1=new ArrayList<String>();*/
        driver.get("http://spicejet.com");
        List<WebElement> str = driver.findElements(By.tagName("a"));
        System.out.println(str.size());
        for (int i = 0; i < str.size(); i++) {
            System.out.println(str.get(i).getText().trim());//str[i]
        }

    }

    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver",
                "D:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }

}
