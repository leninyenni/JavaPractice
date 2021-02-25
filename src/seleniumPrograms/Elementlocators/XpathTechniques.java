package seleniumPrograms.Elementlocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static seleniumPrograms.Notes.BaseClass.testbase;

public class XpathTechniques {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

       driver= testbase();
       driver.get("https://demoqa.com/automation-practice-form");
       driver.manage().window().maximize();
//       Thread.sleep(3000);
       String title=driver.getTitle();
        System.out.println(title);
        WebDriverWait driverWait= new WebDriverWait(driver,10);
        driverWait.until(ExpectedConditions.titleIs(driver.getTitle()));
        driver.close();
    }

}
