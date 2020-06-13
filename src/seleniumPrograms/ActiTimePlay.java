package seleniumPrograms;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class ActiTimePlay extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		List<WebElement> List = driver.findElements(By.xpath("//a[text()]"));	
	Iterator itr = List.iterator();
		int i = 0;
		while (itr.hasNext()) {
			System.out.println(List.get(i).getText());
			i++;
		}
	}
}
