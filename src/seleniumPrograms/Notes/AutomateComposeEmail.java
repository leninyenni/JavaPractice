package seleniumPrograms.Notes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateComposeEmail {
	public static void main(String[] args) throws InterruptedException {
	
	//launch Browser
	System.setProperty("webdriver.chrome.driver",
			"D:\\Drivers\\updatedchrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	Thread.sleep(10000);
	//System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	//ChromeDriver driver=new ChromeDriver();
	//Open Gmail
	
	driver.get("http://www.gmail.com");
	//Enter username and enter
	driver.findElement(By.xpath("//*[@autocomplete='username']")).sendKeys("leninkumaryenni2");
	driver.findElement(By.xpath("//*[text()='Next']")).click();
	Thread.sleep(5000);
	//Enter password and submit
	//driver.findElement(By.name("password")).sendKeys("<pwd>");
	driver.findElement(By.xpath("(//*[@aria-label='Enter your password'] [@name='password'])")).sendKeys("trynewpwd");
	driver.findElement(By.xpath("//*[text()='Next']")).click();
	Thread.sleep(10000);
	//Compose and send mail
	driver.findElement(By.xpath("//*[text()='Compose']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//*[@aria-label='To']")).sendKeys("leninkumaryenni@gmail.com");
	driver.findElement(By.name("subjectbox")).sendKeys("Wishes");
	driver.findElement(By.xpath("(//*[@aria-label='Message Body'])[2]")).sendKeys("Hi Sandhya, \n This is automation program execution from firefox.\n\n Bye");
	driver.findElement(By.xpath("//input[contains(@aria-label, 'Send')]")).click();
	Thread.sleep(5000);
	//Logout
	driver.findElement(By.xpath("//*[contains(@aria-label, 'Google Account')]")).click();
	driver.findElement(By.linkText("Sign out"));
	//close SUT
	driver.close();
}
}