package javaLearning.ConstructorRelated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelPerspective {

    public WebDriver driver;
    public SelPerspective(String brower)
    {
        if (brower.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\updatedchrome\\chromedriver.exe");
            this.driver = new ChromeDriver();
        }
        else if (brower.equals("firefox"))
        {
            System.setProperty("webdriver.gecko.driver","D://Drivers//geckodriver.exe");
            this.driver= new FirefoxDriver();
        }
        else if (brower.equals("edge"))
        {
            System.setProperty("webdriver.edge.driver","C:\\Users\\91939\\edgedriver\\msedgedriver.exe");
            this.driver= new EdgeDriver();
        }

    }
    public void launchGoogle()
    {
        driver.get("https://www.google.com");
    }
    public void searchWith(String str)
    {
        driver.findElement(By.name("q")).sendKeys(str);
    }

    public void clickOnImages()
    {
        driver.findElement(By.linkText("Images")).click();
    }

    public static void main(String[] args) {
        /*SelPerspective selc = new SelPerspective("chrome");
        selc.launchGoogle();

        selc.searchWith("Sachin Tendulkar");*/
      /*  SelPerspective self = new SelPerspective("firefox");
        self.launchGoogle();
        self.searchWith("M S Dhoni");*/

        SelPerspective selie= new SelPerspective("chrome");
        selie.launchGoogle();
        selie.searchWith("Virat Kohli");
        selie.clickOnImages();
    }
}
