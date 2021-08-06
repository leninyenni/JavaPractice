package seleniumPrograms.Notes;
import java.io.File;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
public class Alert_Promptpopup {
	public static void main(String[] args) throws InterruptedException {
		/*System.setProperty("webdriver.chrome.driver",
				"D:\\Drivers\\updatedchrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		
		  System.setProperty("webdriver.gecko.driver",
		  "E://Drivers//geckodriver.exe"); 
		  File pathToBinary = new
		  File("C://Program Files//Mozilla Firefox//firefox.exe");
		  FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		  FirefoxProfile firefoxProfile = new FirefoxProfile(); WebDriver
		  driver = new FirefoxDriver();
		  
		 
		// Enter the url
		driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
		// find this button : "Say my name"
		driver.findElement(By.xpath("//input[@value='Say my name!']")).click();
		Thread.sleep(5000);
		// Switch to alert pop up
		Alert alert = driver.switchTo().alert();
		Thread.sleep(5000);
		// print the text present on the alert pop up
		System.out.println(alert.getText());
		// enter your name in the text box present on the alert pop up
		alert.sendKeys("ajit");
		Thread.sleep(5000);
		// click on OK button
		alert.accept();
		Thread.sleep(3000);
		// print the text present on the second alert pop up
		System.out.println(alert.getText());
		// click on Cancel button
		alert.accept();
	}
}