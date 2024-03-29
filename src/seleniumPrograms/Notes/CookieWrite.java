package seleniumPrograms.Notes;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CookieWrite {
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"D:\\Drivers\\updatedchrome\\chromedriver.exe");
		driver = new ChromeDriver();
		try {
			File file = new File("D:\\Selenium Training\\Cookies.data");
			FileReader fileReader = new FileReader(file);
			BufferedReader Buffreader = new BufferedReader(fileReader);
			String strline;
			while ((strline = Buffreader.readLine()) != null) {
				StringTokenizer token = new StringTokenizer(strline, ";");
				while (token.hasMoreTokens()) {
					String name = token.nextToken();
					String value = token.nextToken();
					String domain = token.nextToken();
					String path = token.nextToken();
					String dateString = token.nextToken();
					System.out.println(dateString);
					
				    SimpleDateFormat formatter = new SimpleDateFormat("EEE MMM d HH:mm:ss z yyyy");  
				    Date expiry = formatter.parse(dateString); 
				    
//					String val;
					
					/*if (!(val = token.nextToken()).equals("null")) {
						expiry = new Date(val);
					}*/
					Boolean isSecure = new Boolean(token.nextToken())
							.booleanValue();
					Cookie ck = new Cookie(name, value, domain, path, expiry,
							isSecure);
					System.out.println(ck);
					driver.manage().addCookie(ck); // This will add the stored
													// cookie to your current
													// session
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		driver.get("http://www.facebook.com");
	}
	
}
