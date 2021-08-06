package seleniumPrograms.AdvancedIncDell;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class PieChartRead {
	WebDriver driver;
	@BeforeTest
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Drivers\\updatedchrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://yuilibrary.com/yui/docs/charts/charts-pie.html");
	}
	public void CaptureScreenShot(String str) throws IOException {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);// Convert
																				// web
																				// driver
																				// object
																				// to
																				// TakeScreenshot
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		// Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		// Move image file to new destination
		String filename = new SimpleDateFormat("yyyyMMddhhmmss'.txt'")
				.format(new Date());
		File DestFile = new File("D:\\Desktop\\screens\\" + str + filename
				+ ".png");
		// Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
	}
	@Test
	public void pieChart() throws InterruptedException, IOException {
		// Locate pie chart elements based on different colors.
		WebElement VioleteColor = driver
				.findElement(By
						.xpath("//*[contains(@class,'yui3-svgSvgPieSlice')][@fill='#66007f']"));
		WebElement GreenColor = driver
				.findElement(By
						.xpath("//*[contains(@class,'yui3-svgSvgPieSlice')][@fill='#295454']"));
		WebElement GreyColor = driver
				.findElement(By
						.xpath("//*[contains(@class,'yui3-svgSvgPieSlice')][@fill='#e8cdb7']"));
		WebElement LightVioleteColor = driver
				.findElement(By
						.xpath("//*[contains(@class,'yui3-svgSvgPieSlice')][@fill='#996ab2']"));
		WebElement BrownColor = driver
				.findElement(By
						.xpath("//*[contains(@class,'yui3-svgSvgPieSlice')][@fill='#a86f41']"));
		// locate tooltip pie chart.
		WebElement ToolTip = driver.findElement(By
				.xpath("//div[contains(@id,'_tooltip')]"));
		// Click on pie chart parts and get tooltip values. click on the violet part so that the tooltip appears on the DOM
		System.out.println("-X-X-X-X-X-X-X-X- Violete Part -X-X-X-X-X-X-X-X-");
		VioleteColor.click();
		CaptureScreenShot("violet");
		//get the tooltip text
		System.out.println(ToolTip.getText());
		System.out.println();
		System.out.println("-X-X-X-X-X-X-X-X- Grey Part -X-X-X-X-X-X-X-X-");
		GreyColor.click();
		CaptureScreenShot("grey");
		System.out.println(ToolTip.getText());
		System.out.println();
		System.out
				.println("-X-X-X-X-X-X-X-X- Light Violete Part -X-X-X-X-X-X-X-X-");
		LightVioleteColor.click();
		System.out.println(ToolTip.getText());
		System.out.println();
		System.out.println("-X-X-X-X-X-X-X-X- Green Part -X-X-X-X-X-X-X-X-");
		GreenColor.click();
		System.out.println(ToolTip.getText());
		CaptureScreenShot("green");
		System.out.println();
		System.out.println("-X-X-X-X-X-X-X-X- Brown Part -X-X-X-X-X-X-X-X-");
		Thread.sleep(5000);
		try {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", BrownColor);
		} catch (Exception e) {
			System.out.println("brown part is too small to click");
		}
		// BrownColor.click();
		System.out.println(ToolTip.getText());
	}
}
