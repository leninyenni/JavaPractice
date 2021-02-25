package seleniumPrograms.Notes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class FaceBookPageElements {
	@FindBy(xpath = "//input[@id='emaill']")
	public WebElement fbusername;
	@FindBy(xpath = "//input[@id='pass']")
	public WebElement fbpassword;
	@FindBy(xpath = "//input[value='Log In']")
	public WebElement loginbutton;
	
	public WebElement pagecontainer(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[contains(@data-testid,'pageCreationHeaderBannerTitle')]"));
	}
	// Initialisation
	public void LoginPage(WebDriver driverz) {
		PageFactory.initElements(driverz, this);
	}
	
	
		
	
	public void setUsername(String username) {
		try {
			fbusername.sendKeys(username);
		} catch (Exception e) {
			System.out.println("this from second class");
			
		}
		
		
	}
	public void clicklogin()
	{
		loginbutton.isEnabled();
		loginbutton.click();
		
	}
}
