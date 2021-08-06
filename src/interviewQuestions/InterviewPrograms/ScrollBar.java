package interviewQuestions.InterviewPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBar {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\updatedchrome\\chromedriver.exe");
        WebDriver dr = new ChromeDriver();
        dr.manage().window().maximize();

        dr.get("https://opensource-demo.orangehrmlive.com/");       //testing webpage

        WebElement uname = dr.findElement(By.id("txtUsername"));   //username
        uname.sendKeys("Admin");
        WebElement pwd = dr.findElement(By.name("txtPassword"));  //password
        pwd.sendKeys("admin123");
        WebElement login_button =
                dr.findElement(By.xpath("//input[@id='btnLogin']"));
        login_button.click();                         //loginbutton
        JavascriptExecutor js = (JavascriptExecutor)dr;
        js.executeScript("window.scrollBy(0,70)");            //Scroll Down(+ve)
        Thread.sleep(3000);
        System.out.println("Scrolled down..");

        js.executeScript("window.scrollBy(0,-50)");           //Scroll Up (-ve)
        Thread.sleep(3000);
        System.out.println("Scrolled up..");
    }
}
