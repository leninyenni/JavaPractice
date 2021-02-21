package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestSlider {
    WebDriver driver;
    WebDriverWait wait;

    String url = "http://jqueryui.com/resources/demos/slider/default.html";

        By slider  = By.xpath("//*[@id='slider']");
    /*By hiddenPriceLocator  = By.id("sliderPrixPropriete");
    By enterPriceLocator   = By.id("PrixPropriete");
    By plusLocator         = By.id("PrixProprietePlus");*/

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "C://Users//91939//drivers//chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    public WebElement findElement(By locator) {
        return
                wait.until(ExpectedConditions.
                        elementToBeClickable(locator));
    }

    public WebElement findHiddenElement(By locator) {
        return
                wait.until(ExpectedConditions.
                        presenceOfElementLocated(locator));
    }

    @Test
    public void moveSliderToEnd() {

        driver.get(url);

        WebElement priceSlider =
                findElement(slider);

        assertTrue(priceSlider.isDisplayed());
        /*Dimension sliderSize = priceSlider.getSize();
        int sliderWidth = sliderSize.getWidth();
*/
        int xCoord = priceSlider.getLocation().getX();

        Actions builder = new Actions(driver);
        builder.moveToElement(priceSlider)
                .click()
                .dragAndDropBy
                        (priceSlider,xCoord + 100, 0)
                .build()
                .perform();


    }
}


