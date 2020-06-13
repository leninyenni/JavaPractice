package seleniumPrograms.DataDriven;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import seleniumPrograms.DataDriven.library.ExcelConfig;

public class WordPressExcel {

	WebDriver driver;

	@Test(dataProvider = "wordPress")
	public void WordPressLogin(String username, String password)
			throws Exception {
		driver = new FirefoxDriver();

		driver.get("http://demosite.center/wordpress/wp-login.php");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.id("wp-submit")).click();
		Thread.sleep(5000);
		// String str=driver.getTitle();
		// System.out.println(str);

		Assert.assertTrue(driver.getTitle().contains("Dashboard"), "invalid");
		System.out.println("valid");
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	@DataProvider(name = "wordPress")
	public Object[][] wordPressCreds() {
		ExcelConfig EC = new ExcelConfig(
				"C:\\Users\\Lenin\\workspace\\JAVA_Practice\\TestData\\Test.xlsx");
		int rows = EC.getRowCount(0);

		Object[][] data = new Object[rows][2];
		for (int i = 0; i < rows; i++) {
			data[i][0] = EC.getExcel(0, i, 0);
			data[i][1] = EC.getExcel(0, i, 1);
		}
		return data;
	}

}
