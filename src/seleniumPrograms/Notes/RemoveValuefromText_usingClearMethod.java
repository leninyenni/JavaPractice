package seleniumPrograms.Notes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class RemoveValuefromText_usingClearMethod extends BaseClass {
	public static void main(String[] args) throws InterruptedException {

	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("ajit    asdf");
	Thread.sleep(2000);
	String value = driver.findElement(By.id("username")).getAttribute("value");
	System.out.println("Value present inside the text box is : "+value);
	driver.findElement(By.id("username")).clear();
	Thread.sleep(2000);
	driver.findElement(By.id("username")).sendKeys("againEntered    Ajit");
	Thread.sleep(2000);
	//this line will actually delete the value if there is no space in the text entered
	driver.findElement(By.id("username")).sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
	// if there is a space between two words in the username field, we have to use the below lines of code
	driver.findElement(By.id("username")).sendKeys(Keys.CONTROL+"a") ;
	driver.findElement(By.id("username")).sendKeys(Keys.DELETE);
	Thread.sleep(2000);
	}
}
