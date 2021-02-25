package seleniumPrograms.Notes;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class PrintInfoWebFacebook extends BaseClass {
	public static WebDriver driver1;
	public static WebDriver driver2;
	public static void main(String[] args) throws InterruptedException {
		// Jus a sample try sometime
		/*
		 * try{ System.setProperty("webdriver.chrome.driver",
		 * "C://Users//91939//drivers//chromedriver.exe");
		 * 
		 * //driver1=initialize(); driver1=testbase();
		 * driver1.manage().window().maximize();
		 * 
		 * driver1.get("https://www.facebook.com"); FaceBookPageElements fbpe=
		 * new FaceBookPageElements(); fbpe.LoginPage(driver1);
		 * fbpe.setUsername("leninkumaryennis"); //driver1.close();
		 * fbpe.clicklogin(); Thread.sleep(2000); } catch (Exception exception)
		 * { System.out.println("this is from Main class");
		 * 
		 * }
		 */
		// totallinks
		driver1 = testbase();
		
		FaceBookPageElements fbpe= new FaceBookPageElements();
		fbpe.LoginPage(driver1);
		driver1.get("https://www.facebook.com");
		List<WebElement> webelements = driver1.findElements(By.xpath("//a"));
		System.out.println(webelements.size());
		 driver.findElement(By.linkText("Create Page")).click();
		String message = fbpe.pagecontainer(driver).getText();
		System.out.println(message);
		if (message.equals("Connect your business, yourself or your cause to the worldwide community of people on Facebook. To get started, choose a Page category."))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
		
		/*String Bannermessage = driver1
				.findElement(
						By.xpath("//div[@data-testid='pageCreationHeaderBannerSubtitle']"))
				.getText();
		System.out.println(Bannermessage);*/
		// code to get text all over the page
		List<WebElement> firstboxmessages = driver1
				.findElements(By
						.xpath("//div[@data-testid='BUSINESS_SUPERCATEGORYCardContainer']/div/div/span"));
		int size = firstboxmessages.size();
		System.out.println(size);
		for (WebElement e : firstboxmessages) {
			System.out.println("1");
			System.out.println(e.getAttribute("innerText"));
		}
		String info = driver1
				.findElement(
						By.xpath("(//div[@data-testid='BUSINESS_SUPERCATEGORYCardContainer']/div/div/span)[4]"))
				.getAttribute("innerText");
		System.out.println(info);
		List<WebElement> secondmessages = driver1
				.findElements(By
						.xpath("(//div[@data-testid='NON_BUSINESS_SUPERCATEGORYCardContainer']/div/div/span)"));
		System.out.println(secondmessages.size());
		for (WebElement f : secondmessages) {
			System.out.println("2");
			System.out.println(f.getAttribute("innerText"));
		}
	}
	/*
	 * //driver2= new ChromeDriver(); //driver2=initialize();
	 * driver2.manage().window().maximize();
	 * driver2.get("https://www.twitter.com"); driver2.close();
	 */
	// driver.get("https://www.facebook.com/");
}
