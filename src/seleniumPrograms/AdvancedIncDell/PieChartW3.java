package seleniumPrograms.AdvancedIncDell;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class PieChartW3 {
	public static void main(String args[]) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"D://Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://www.w3schools.com/howto/howto_google_charts.asp");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo()
				.frame(driver.findElement(By
						.xpath(".//iframe[@src='tryhow_google_pie_chart.htm']")));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String expectedTooltip = "Github";
		WebElement github = driver
				.findElement(By
						.xpath(".//*[@id='piechart']/div/div/div/*[name()='svg']/*[name()='g'][4]/*[name()='text']"));
		String actualTooltip = github.getText();
		// Assert the tooltip's value is as expected
		System.out.println("Actual Title of Tool Tip" + actualTooltip);
		if (actualTooltip.equals(expectedTooltip)) {
			System.out.println("Test Case Passed");
		}
		driver.close();
	}
}
