package seleniumPrograms;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutosuggestionEx_GoogleSearch extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		driver.get("http://www.google.com");
		//Enter Selenium in google search text box
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> allOptions =
		driver.findElements(By.xpath("//*[contains(text(),'selenium')]"));
		int count = allOptions.size();
		System.out.println("Number of values present in the dropdown is :" + count);
		String expectedValue="selenium interview questions";
		//Print all the auto suggestion values
		for (WebElement option : allOptions) {
		String text = option.getText();
		System.out.println(" "+text);
		expectedValue="selenium webdriver";

		if (text.equalsIgnoreCase(expectedValue)) {

		option.click();
		break;
		}

		}
}
}
