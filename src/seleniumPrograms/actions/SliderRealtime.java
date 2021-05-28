package seleniumPrograms.actions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import seleniumPrograms.HandlingPopUps.UsingJavaScriptExecutor;

//use Cordinates chrome plug in to get values
//Point class to get location of element and then use
//WebElement ele= driver.findElement(By.xpath("x-path"));
//Point point = ele.getLocation();
//int xcord = point.getX();
//int ycord = point.getY();


public class SliderRealtime extends UsingJavaScriptExecutor {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "D:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com");
        Thread.sleep(5000);
/*		Alert alert= driver.switchTo().alert();
		alert.dismiss();*/
        driver.findElement(By.xpath("//button[text()='✕']")).click();
        driver.manage().window().maximize();
        Actions a = new Actions(driver);
        WebElement electronicsmenu = driver.findElement(By.xpath("//div[text()='Electronics']"));
        drawBorder(electronicsmenu, driver);
        a.moveToElement(electronicsmenu).build().perform();
        Thread.sleep(2000);
        WebElement audiomenu = driver.findElement(By.xpath("//a[text()='Tablets']"));
        drawBorder(audiomenu, driver);
        a.moveToElement(audiomenu).build().perform();
        Thread.sleep(2000);
        audiomenu.click();
        Thread.sleep(5000);

        /*builder.moveToElement(slider)
                .click()
                .dragAndDropBy
                        (slider,xCoord +10, 0)
                .build()
                .perform();
        builder.release();*/
        WebElement slider = driver.findElement(By.xpath("//span[text()='Price']/../..//following-sibling::div[2]"));
        WebElement leftslider = driver.findElement(By.xpath("(//span[text()='Price']/../..//following-sibling::div[2]/div/div/div[1])[1]"));
        int width = slider.getSize().getWidth();
        System.out.println(width);
        Actions move = new Actions(driver);
        Action action = move.dragAndDropBy(leftslider, ((width * 25) / 100), 0).build();
        action.perform();
        Thread.sleep(10000);
        //move the slider to in right to left direction, use '-'
        By locator = By.xpath("(//span[text()='Price']/../..//following-sibling::div[2]/div/div/div[1])[2]");
        // retryElement(locator, driver);
        move.dragAndDropBy(driver.findElement(locator), -((width * 25) / 100), 0).build().perform();
        System.out.println("Slider moved");
    }

    //method to overcome stale element reference exception
    public static void retryElement(By locator, WebDriver driver) {
        //variable to count the attempts
        int attempts = 0;
        //number of times this code should get executed
        while (attempts < 2) {
            try {
                //wait explicitly till desired element is visible and clickable
                WebDriverWait wait = new WebDriverWait(driver, 30L);
                wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
                wait.until(ExpectedConditions.elementToBeClickable(locator));
                //click on the locator once it is found and terminate the loop
                driver.findElement(locator);
                break;
            } catch (StaleElementReferenceException e) {
            }
            attempts++;
        }
    }
}

