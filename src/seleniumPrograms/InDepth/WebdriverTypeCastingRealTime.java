package seleniumPrograms.InDepth;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class WebdriverTypeCastingRealTime {
    static WebDriver driver;
    static String browserName;

    public static void main(String[] args) throws IOException {
        System.out.println("enter browser type:");
        Scanner scanner= new Scanner(System.in);
        browserName= scanner.next();

        //this is how it looks like in real time and here we need to pass browserName from either application.properties or some other property file
        switch (browserName)
        {
            case "chrome":
                System.setProperty("webdriver.chrome.driver",
                        "D:\\Drivers\\updatedchrome\\chromedriver.exe");
                driver= new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.geckodriver.driver",
                        "C://Users//91939//drivers//geckodriver.exe");
                driver= new FirefoxDriver();
                break;
            default:
                break;
        }
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //driver.getS--> JavaScriptExecutor and TakeScreenShot methods are not available to driver
        //to get the titile
        JavascriptExecutor javascriptExecutor= (JavascriptExecutor) driver;
        String title = (String) javascriptExecutor.executeScript("return document.title");
        System.out.println(title);

        //to take the screenshot
        TakesScreenshot takesScreenshot= (TakesScreenshot) driver;
        File file=takesScreenshot.getScreenshotAs(OutputType.FILE);
        String projectdirectory = System.getProperty("user.dir");
        FileUtils.copyFile(file,new File(projectdirectory +"//"+ "capturescreen"+ ".jpg"));
        driver.quit();

    }
}
