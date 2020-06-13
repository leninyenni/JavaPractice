package seleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {
	
	public static WebDriver driver;
	
	/*static
	{
		
		System.setProperty("webdriver.chrome.driver",
				"D://Drivers//chromedriver_win32//chromedriver.exe");
		//driver= new ChromeDriver();
		
	}*/
	
	/*public static WebDriver initialize()
	{
		WebDriver driver= new ChromeDriver();
		return driver;
	}*/
	
	/*public static BaseClass getbase()
	{
		return new BaseClass();
	}*/
	
	public static WebDriver testbase()
	{
		System.setProperty("webdriver.chrome.driver",
				"D://Drivers//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	BaseClass()
	{
		//code
	}
}


