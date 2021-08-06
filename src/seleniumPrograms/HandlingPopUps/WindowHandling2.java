package seleniumPrograms.HandlingPopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandling2 extends UsingJavaScriptExecutor {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "D:\\Drivers\\updatedchrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //navigate to the url
        driver.get("http://demo.automationtesting.in/Windows.html");
        //print the title of the main window
        System.out.println("The title of the main window :" + driver.getTitle());
        WebElement wb = driver.findElement(By.xpath("//*[@id='Tabbed']/a/button"));
        String parentwindow = driver.getWindowHandle();
        System.out.println(parentwindow);
        drawBorder(wb, driver);
        flash(wb, driver);
        wb.click();
        Thread.sleep(3000);
        String childwindow = driver.getWindowHandle();
        Set<String> nowWindows= driver.getWindowHandles();
        System.out.println("All handles after clicked on click button:"+nowWindows);
        System.out.println(childwindow);
        /*driver.switchTo().window(parentwindow);
        Thread.sleep(3000);*/
        if (parentwindow.equals(childwindow)) {
            System.out.println("Control was not shifted");
        } else {
            System.out.println("control was shifted for driver so you have to bring it back");
        }
        driver.findElement(By.xpath("//a[@class='link youtube']")).click();
        //It returns the no. of the windows opened by the web driver and handle all new opened window.
        Set<String> set = driver.getWindowHandles();
        //to get the value from set object, we will use iterator
        Iterator<String> it = set.iterator();
        System.out.println(set);
        String parentId = it.next();
        //print the parent window id
        System.out.println("parent window pop-up id" + parentId);
        String childId = it.next();
        //print the child window id
        System.out.println("child window pop-up id" + childId);
        //switch to child window
        driver.switchTo().window(childId);
        //print the title of child window
        System.out.println("child window pop-up title:" + driver.getTitle());
        Thread.sleep(3000);
        //close the child window
        driver.close();
        //switch to parent window that is main window
        driver.switchTo().window(parentId);
        //print the title of parent window
        System.out.println("parent window pop-up title:" + driver.getTitle());
        Thread.sleep(3000);
        //close the parent window
        driver.close();
    }
}
