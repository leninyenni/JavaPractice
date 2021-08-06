package companies.intrvwQustns.Wipro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthInPopUp {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "D:\\Drivers\\updatedchrome\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        //format should be : http://username:password@url
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
        String message= driver.findElement(By.cssSelector("p")).getText();
        System.out.println(message);

    }
}
