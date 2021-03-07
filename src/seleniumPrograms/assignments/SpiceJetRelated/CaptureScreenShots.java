package seleniumPrograms.assignments.SpiceJetRelated;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class CaptureScreenShots {

    public WebDriver driver;

    public void captureScreenShot(String str) throws Exception {
        DateFormat dateFormat = new SimpleDateFormat("yyyy_MMM_dd HH_mm_ss");
        Date date = new Date();
        String time = dateFormat.format(date);
        File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String projectdirectory = System.getProperty("user.dir");
        FileUtils.copyFile(f, new File(projectdirectory + "\\spicejetscreenshots\\" + str + time + ".jpg"));
    }

    @Test
    public void f() throws Exception {
        System.setProperty("webdriver.chrome.driver",
                "C://Users//91939//drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://spicejet.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        captureScreenShot("Homepage");
        driver.findElement(By.linkText("Hotels")).click();
        Thread.sleep(4000);
        captureScreenShot("Hotels");
        driver.findElement(By.linkText("Covid-19 Information")).click();
        //simple way1 to switch to a new window
        Set<String> windowids = driver.getWindowHandles();
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());

        /*//another way
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> windowStrings = new ArrayList<>(windowHandles);
        String reqWindow = windowStrings.get(1);
        driver.switchTo().window(reqWindow);
*/
        Thread.sleep(4000);
        captureScreenShot("CovidInformation");
    }
}
