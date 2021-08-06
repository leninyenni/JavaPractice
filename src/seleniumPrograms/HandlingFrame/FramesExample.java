package seleniumPrograms.HandlingFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FramesExample {
    public static void main(String[] args) throws NoSuchElementException, InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "D:\\Drivers\\updatedchrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //if you observe the output,it will give all frames available in html (it will exclude frames inside frames)
        int size1 = driver.findElements(By.tagName("iframe")).size();
        System.out.println(size1);

        //this will not work since its inside a frame
        //driver.findElement(By.xpath("//input[@id='a']")).click();
        //now what you have to do is switch to Frame and then do the action

        driver.switchTo().frame(0); // Switching to first frame
        Thread.sleep(5000);
        int size2 = driver.findElements(By.tagName("iframe")).size();
        System.out.println(size2);
        driver.switchTo().frame(0); //switching to inner frame
       driver.findElement(By.xpath("//input[@id='a']")).click();
       //it will come to first frame
       driver.switchTo().parentFrame();//it will take you to parent frame of inner frame that you are in
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello buddy");
        driver.switchTo().defaultContent(); //it will get you to first place where you have started going to frames,i.e main body
       driver.findElement(By.xpath("//a[contains(@href,'learn-selenium')]")).click();
    }
}
