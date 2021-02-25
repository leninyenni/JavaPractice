package seleniumPrograms.Notes;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VerifyFB_Usernamefield_lessthanMobileNumberField extends BaseClass{
	public static void main(String[] args) {

	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	WebElement unTB = driver.findElement(By.id("email"));
	int username_width = unTB.getSize().getWidth();
	System.out.println(username_width);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//Identify the mobile number text box
	WebElement mobileNumTB = driver.findElement(By.xpath("//input[contains(@aria-label,'Mobile number or email address')]"));
	int mobNumWidth = mobileNumTB.getSize().getWidth();
	System.out.println(mobNumWidth);
	//Compare the width of both username and mobilenumber text box
	if (username_width==mobNumWidth) {
	System.out.println("Size of Both username and password fields are same" +username_width+" =" + mobNumWidth);
	}else{
	System.out.println("Size of username and password fields are NOT same that is : "
	+username_width+" Not equals to " + mobNumWidth);
	}
	}
}
