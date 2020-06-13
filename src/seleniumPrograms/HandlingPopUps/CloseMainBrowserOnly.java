package seleniumPrograms.HandlingPopUps;

import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMainBrowserOnly {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D://Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.naukri.com/ ");
		String title=driver.getTitle();
		//get the window handle id of the parent browser window
		String parentWindowhandleID = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		int count = allWindowHandles.size();
		System.out.println("Number of browser windows opened on the system is : "+ count);
		for (String windowHandle : allWindowHandles) {
		//switch to each browser window
		driver.switchTo().window(windowHandle);
		/* compare the window id with the Parent browser window id, if both are equal, then
		only close the main browser window.*/
		if (windowHandle.equals(parentWindowhandleID)) {
		driver.close();
		System.out.println("Main Browser window with title -->"+ title +" --> is closed");
		}}}}

