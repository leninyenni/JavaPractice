package seleniumPrograms.assignments.SpiceJetRelated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class DropdownValidation {
    public WebDriver driver;

    @Test
    public void f() {
   /*   String s[]=new String[15];
   List<String> s1=new ArrayList<String>();*/

        driver.get("http://spicejet.com");
        driver.findElement(By.linkText("Flights")).click();
        String str = "ctl00_mainContent_ddl_Adult";
        List<WebElement> s = new Select(driver.findElement(By.id(str))).getOptions();
        System.out.println(s.size());
        for (int i = 0; i < s.size(); i++) {
            //System.out.println(s.get(i).getText());
            if (s.get(i).getText().equalsIgnoreCase("5 Adults")) {
                System.out.println(s.get(i).getText());
                new Select(driver.findElement(By.id(str))).selectByVisibleText(s.get(i).getText());
            }
        }

    }

    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver",
                "D:\\Drivers\\updatedchrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
