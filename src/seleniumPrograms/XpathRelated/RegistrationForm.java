package seleniumPrograms.XpathRelated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class RegistrationForm {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "D:\\Drivers\\updatedchrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Sachin");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Tendulkar");
        driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Flat 201,Ram Nagar, Delhi");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("thisisme@yahoo.com");
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9999999999");
        driver.findElement(By.xpath("//input[@type='radio'][@value='Male']")).click();
        driver.findElement(By.xpath("//label[text()='Movies ']//preceding-sibling::input")).click();
        /*driver.findElement(By.xpath("//label[text()='Languages']//following-sibling::div")).click();
        driver.findElement(By.xpath("(//label[text()='Languages'])//following::div/multi-select/div[2]/ul/li[3]")).click();*/

        //this is not working because of site issue
        /*WebElement languages= driver.findElement(By.id("msdd"));
        languages.click();
        languages.sendKeys(Keys.ARROW_DOWN);
        languages.sendKeys(Keys.ARROW_DOWN);
        languages.sendKeys(Keys.ENTER);*/


        driver.findElement(By.xpath("(//body)[1]")).click();
        WebElement skillsdropdown = driver.findElement(By.id("Skills"));
        Select skills = new Select(skillsdropdown);
        skills.selectByVisibleText("AutoCAD");
    }
}
