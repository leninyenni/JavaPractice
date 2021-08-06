package seleniumPrograms.Elementlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;



public class PrintLinks {
	
	private static String[] links = null;
	private static int linksCount = 0;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Drivers\\updatedchrome\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://goconnect.org/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='menu-item-1093']/a/span")).click();
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a")); 
		linksCount = allLinks.size();
		System.out.println("Total no of links Available: "+linksCount);
		links= new String[linksCount];
		System.out.println("List of links Available: ");  
		// print all the links from webpage 
		for(int i=0;i<linksCount;i++)
		{
		links[i] = allLinks.get(i).getAttribute("href");
		System.out.println(allLinks.get(i).getAttribute("href"));
		} 
		
		// navigate to each Link on the webpage
		for(int i=0;i<linksCount;i++)
		{
		
		driver.navigate().to(links[i]);
		long startTime=System.currentTimeMillis();
		//wait till complete page loaded
		long endTime= System.currentTimeMillis();
		long timediff= endTime-startTime;
		System.out.println(links[i]+"timediff");
		}		
		
	}
}
