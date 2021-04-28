package seleniumPrograms.Notes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class PrintInfoWebFacebook extends BaseClass {
    public static WebDriver driver1;
    public static WebDriver driver2;


    @BeforeMethod
    public void setUp() {
        driver1 = testbase();
        driver1.manage().window().maximize();
    }

    @Test(priority = 1)
    public void login() {
        driver1.get("https://www.facebook.com");
        FaceBookPageElements fbpe =
                new FaceBookPageElements();
        fbpe.LoginPage(driver1);
        fbpe.setUsername("leninkumaryenni");
        fbpe.setPassword("Lenin2925");
        fbpe.clicklogin();
        waitForElement(driver1, fbpe.getFBIcon());
        Assert.assertTrue(fbpe.validateFbIcon());
    }

    @Test(priority = 2)
    public void printAllLinks() {
        driver1 = testbase();
        FaceBookPageElements fbpe = new FaceBookPageElements();
        fbpe.LoginPage(driver1);
        driver1.get("https://www.facebook.com");
        List<WebElement> webelements = driver1.findElements(By.xpath("//a"));
        System.out.println(webelements.size());
        driver.findElement(By.linkText("Create Page")).click();
        String message = fbpe.pagecontainer(driver).getText();
        System.out.println(message);
        if (message.equals("Connect your business, yourself or your cause to the worldwide community of people on Facebook. To get started, choose a Page category.")) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }
        String Bannermessage = driver1
                .findElement(
                        By.xpath("//div[@data-testid='pageCreationHeaderBannerSubtitle']"))
                .getText();
        System.out.println(Bannermessage);
        // code to get text all over the page
        List<WebElement> firstboxmessages = driver1
                .findElements(By
                        .xpath("//div[@data-testid='BUSINESS_SUPERCATEGORYCardContainer']/div/div/span"));
        int size = firstboxmessages.size();
        System.out.println(size);
        for (WebElement e : firstboxmessages) {
            System.out.println("1");
            System.out.println(e.getAttribute("innerText"));
        }
        String info = driver1
                .findElement(
                        By.xpath("(//div[@data-testid='BUSINESS_SUPERCATEGORYCardContainer']/div/div/span)[4]"))
                .getAttribute("innerText");
        System.out.println(info);
        List<WebElement> secondmessages = driver1
                .findElements(By
                        .xpath("(//div[@data-testid='NON_BUSINESS_SUPERCATEGORYCardContainer']/div/div/span)"));
        System.out.println(secondmessages.size());
        for (WebElement f : secondmessages) {
            System.out.println("2");
            System.out.println(f.getAttribute("innerText"));
        }
    }

}
