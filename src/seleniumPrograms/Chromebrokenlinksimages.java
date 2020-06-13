package seleniumPrograms;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromebrokenlinksimages {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://Drivers//chromedriver_win32//chromedriver.exe"); 
		WebDriver launchchrome = new ChromeDriver();
		launchchrome.manage().window().maximize();
		launchchrome.manage().deleteAllCookies();
		launchchrome.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); 
	    launchchrome.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		launchchrome.get("https://ui.cogmento.com");
//		launchchrome.findElement(By.xpath("//input[@name='email']")).sendKeys("sgnight30@gmail.com");
//		launchchrome.findElement(By.xpath("//input[@name='password']")).sendKeys("Automatecrm@123");
//		launchchrome.findElement(By.xpath("//div[text()='Login']")).click();
//		// launchchrome.findElement(By.xpath("//span[text()='Calendar']")).click();
//		Thread.sleep(5000);
//		
		launchchrome.get("https://www.theluxepass.com/"); 
		launchchrome.findElement(By.xpath("//span[contains(text(), 'Login / Signup')]")).click();
		launchchrome.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("testingpulp21@gmail.com");
		launchchrome.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("testing@123"); 
		launchchrome.findElement(By.xpath("//button[contains(text(), 'Login')]")).click();
//		launchchrome.manage().timeouts().pageLoadTimeout(100000, TimeUnit.SECONDS); 
//	    launchchrome.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
		Thread.sleep(5000);
		//1. Get the list of all the WebElements having tag <a> using findelements : 
		List<WebElement> list1 = launchchrome.findElements(By.tagName("a"));
		//2. Append the list of all the WebElements having tag <img> with the list having tag <a> using findelements :
		list1.addAll(launchchrome.findElements(By.tagName("img"))); 
		System.out.println("Size of the Initital list --->: "+list1.size());
		//Thread.sleep(5000);
		
		//3. Iterate the list1 and exclude all the elements that don't have "href" attributes : 
		List<WebElement> list2 = new ArrayList<WebElement>();
		for (int i=0; i<list1.size();i++)
		{
			System.out.println(list1.get(i).getAttribute("href"));
            if(list1.get(i).getAttribute("href")!=null && (!list1.get(i).getAttribute("href").contains("javascript"))) 
            list2.add(list1.get(i));
            
		}
        //4. Print the size of the "list2" : 
		System.out.println("Size of the active links list -->: "+list2.size());
		// 5. Check the URL connection could be made or not using httpconnectionapi : 
		for(int j =0; j<list2.size(); j++)
		{  
		    	String url = list2.get(j).getAttribute("href");
		    
			System.out.println(j+"--->"+url);
			Thread.sleep(2000);
			if(url.equals("https://www.theluxepass.com/")) 
//              || url.contains("https://www.facebook.com/theluxepassofficial") ||
//					url.contains("https://www.instagram.com/theluxepassofficial")|| 
//					url.contains("https://itunes.apple.com/in/app/the-luxepass/id1459849565?ls=1&mt=8") || 
//					url.contains("https://play.google.com/store/apps/details?id=com.pulp.luxepass"))
			launchchrome.get(url);	  
			Thread.sleep(3000);
//			HttpURLConnection connection = (HttpURLConnection)new URL(list2.get(j).getAttribute("href")).openConnection();
//			connection.connect();
//			String responsemsg = connection.getResponseMessage();
//			int responsecode = connection.getResponseCode();
//			connection.disconnect();
			 //+ "--->" +responsecode+" "+responsemsg);
	   }	
	}

}
