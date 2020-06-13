package testNGtutorial.CaptureScreenShot.FailedTestCases.NAL;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Base {
	public static WebDriver driver;
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver",
				"D://Drivers//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
	}
	
	public void failed(String testmethodname)
	{
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("C:\\Users\\Lenin\\workspace\\JAVA_Practice\\screenshots\\"+testmethodname+"_"+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
