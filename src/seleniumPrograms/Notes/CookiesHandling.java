package seleniumPrograms.Notes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesHandling {
    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver",
                "D:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        // Input Email id and Password If you are already Register
        driver.findElement(By.name("email")).sendKeys("leninkumaryenni");
        driver.findElement(By.name("pass")).sendKeys("trynewpwd");
        driver.findElement(By.xpath("//input[@aria-label='Log In']")).click();
        // create file named Cookies to store Login Information		
        File file = new File("D:\\Selenium Training\\Cookies.data");
        try {
            // Delete old file if exists
            file.delete();
            file.createNewFile();
            FileWriter fileWrite = new FileWriter(file); //channel							
            BufferedWriter Bwrite = new BufferedWriter(fileWrite);        //work space
            // loop for getting the cookie information 		
            // loop for getting the cookie information
            Set<Cookie> cookies = driver.manage().getCookies();
            for (Cookie ck : cookies) {
                Bwrite.write((ck.getName() + ";" + ck.getValue() + ";" + ck.getDomain() + ";" + ck.getPath() + ";" + ck.getExpiry() + ";" + ck.isSecure()));
                Bwrite.newLine();
            }
            Bwrite.close();
            fileWrite.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
