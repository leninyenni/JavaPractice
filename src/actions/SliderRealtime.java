package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import seleniumPrograms.HandlingPopUps.UsingJavaScriptExecutor;

public class SliderRealtime extends UsingJavaScriptExecutor {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C://Users//91939//drivers//chromedriver.exe");
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

        WebElement slider=driver.findElement(By.xpath("//span[text()='Price']/../..//following-sibling::div[2]"));
        int xCoord = slider.getLocation().getX();

        Dimension sliderSize = slider.getSize();

        int sliderWidth = sliderSize.getWidth();
        System.out.println(sliderWidth);
        //we can use clickandhold method as well
        Actions builder = new Actions(driver);
        /*builder.moveToElement(slider)
                .click()
                .dragAndDropBy
                        (slider,xCoord +10, 0)
                .build()
                .perform();
        builder.release();*/
        builder.clickAndHold(slider).moveByOffset(50,50)
                .build()
                .perform();
        builder.release();

    }
}

