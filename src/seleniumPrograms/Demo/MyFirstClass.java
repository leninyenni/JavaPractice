package seleniumPrograms.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstClass {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver",
                "D:\\Drivers\\updatedchrome\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
       // driver.navigate().to("https://www.flipkart.com");
        driver.quit();
      /*  driver.get("https://www.spicejet.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());*/
       // System.out.println(driver.getPageSource());



    }
}
