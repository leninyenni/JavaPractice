package seleniumPrograms.InDepth;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class WebdriverTypeCasting {

    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver",
                "D:\\Drivers\\chromedriver.exe");
        //if you declare like this then it will run perfectly in chromedriver, but what if you want to run the same script in Firefox,IE??
        //with below declaration if you see all suggested methods on driver, you can getScreenShotAs, executeScript and methods
        //from all the interfaces those which RemoteWebDriver is implementing are available on driver
        //ChromeDriver driver= new ChromeDriver();
        //Refere WebdriverTypeCastingRealTime class on how it looks in real time and why we declare with WebDriver reference
        WebDriver driver= new ChromeDriver();
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
        FileUtils.copyFile(file,new File(projectdirectory + "capturescreen"+ ".jpg"));

        driver.quit();


    }
}
