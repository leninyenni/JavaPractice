package seleniumPrograms.actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class RightClickActions {
	public static void main(String args[]) throws InterruptedException {
		// Instantiating the WebDriver interface.
		System.setProperty("webdriver.chrome.driver",
				"C://Users//91939//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Open the required URL
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		// To maximize the browser
		driver.manage().window().maximize();
		// Create an object 'action' of an Actions class
		Actions action = new Actions(driver);
		By locator = By.xpath("//span[text()='right click me']");
		// Wait for the element. Used Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		WebElement rightClickElement = driver.findElement(locator);
		Thread.sleep(3000);
		// contextClick() method to do right click on the element
		action.contextClick(rightClickElement).build().perform();
		Thread.sleep(3000);
		WebElement getCopyText = driver.findElement(By
				.cssSelector(".context-menu-icon-copy"));
		// getText() method to get the text value
		String GetText = getCopyText.getText();
		// To print the value
		System.out.println(GetText);
		// To close the browse
		
		driver.close();
	}
}
