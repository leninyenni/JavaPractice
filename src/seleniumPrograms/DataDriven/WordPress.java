package seleniumPrograms.DataDriven;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WordPress {

	WebDriver driver;

	@Test(dataProvider = "wordPress")
	public void WordPressLogin(String username, String password) throws Exception {
		driver = new FirefoxDriver();
		
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.id("wp-submit")).click();
		Thread.sleep(5000);
		//String str=driver.getTitle();
		//System.out.println(str);
		
		Assert.assertTrue(driver.getTitle().contains("Dashboard"), "invalid");
		System.out.println("valid");
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	@DataProvider(name = "wordPress")
	public Object[][] wordPressCreds() {
		Object[][] data = new Object[3][2];

		data[0][0] = "admin1";
		data[0][1] = "demo1";
		data[1][0] = "admin";
		data[1][1] = "demo123";
		data[2][0] = "admin2";
		data[2][1] = "demo2";
		return data;
	}

}
