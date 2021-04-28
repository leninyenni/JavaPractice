package seleniumPrograms.HandlingPopUps;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAnySpecifiedBrowser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "D:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(" https://www.naukri.com/ ");
       //It will give all opened windows when launched to naukri.com
        Set<String> allWindowHandles = driver.getWindowHandles();
        int count = allWindowHandles.size();
        System.out
                .println("Number of browser windows opened on the system is : "
                        + count);
        System.out.println(allWindowHandles);
        for (String windowHandle : allWindowHandles) {
            // switch to each browser window
            driver.switchTo().window(windowHandle);
            System.out.println(driver.getTitle());
            String actual_title = driver.getTitle();
            // Checks whether the actual title contains the specified expected
            // title
            if (actual_title.contains("ICICI")) {
                driver.close();
                System.out.println("Specified Browser window with title -->"
                        + actual_title + " --> is closed");
                Thread.sleep(5000);
            } else if (actual_title.contains("amazon")) {
                driver.close();
                System.out.println("Specified Browser window with title -->"
                        + actual_title + " --> is closed");
            }
        }
        Thread.sleep(8000);
        System.out.println("Now closing all browsers");
        driver.quit();
    }
}

