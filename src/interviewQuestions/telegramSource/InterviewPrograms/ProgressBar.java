package interviewQuestions.telegramSource.InterviewPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ProgressBar {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "D:\\Drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://jqueryui.com/progressbar/#download");
        WebDriverWait wait=new WebDriverWait(driver,10);



        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.switchTo().frame(0);

        By progressBar= By.xpath("//div[@id='progressbar']");
        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(progressBar));
        driver.findElement(By.xpath("//button[@id='downloadButton']")).click();
       //this wait to get that aria-valuenow value to start from 0
        Thread.sleep(5000);
        System.out.println(driver.findElement(progressBar).getAttribute("aria-valuenow"));

        //this is to wait until progress bar's attribute aria-valuenow reaches to 100
       // wait.until(ExpectedConditions.attributeContains(progressBar,"aria-valuenow", "100"));


        //if you want to cancel before it reaches to 100

        String value=driver.findElement(progressBar).getAttribute("aria-valuenow");
        int val=Integer.parseInt(value);

        while (val>0 && val<100)
        {
            System.out.println(val);
            driver.findElement(By.xpath("//button[text()='Cancel Download']")).click();
        }
        /*if(driver.findElement(progressBar).getAttribute("aria-valuenow").equals("50"))
        {
            System.out.println("hello its fifty");
        }
        else
        {
            driver.findElement(By.xpath("//button[text()='Cancel Download']")).click();
        }*/



    }
}
