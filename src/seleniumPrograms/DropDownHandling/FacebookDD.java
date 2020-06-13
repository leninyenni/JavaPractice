package seleniumPrograms.DropDownHandling;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FacebookDD {

	@Test
	public void selectDropdown() throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		WebElement month_id = driver.findElement(By.id("month"));
		Select dropdown = new Select(month_id);
		List<WebElement> monthlist = dropdown.getOptions();
		
		
		for (WebElement ele : monthlist) {
		
			String month = ele.getText();
			if(!(month.equals("Month")))
				System.out.println(month);
			
			driver.quit();
		}

	}

}
