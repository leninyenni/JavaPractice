package seleniumPrograms.Elementlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GetCssValues {

    public WebDriver driver;
    private By bySearchButton = By.name("btnK");
    private By SignInButton= By.xpath("//a[text()='Sign in']");
    private By lnk_gmail= By.xpath("//a[text()='Gmail']");

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.google.com");
    }

    @Test(priority=1)
    public void getCssValue_ButtonColor() throws InterruptedException {
        WebElement googleSearchBtn = driver.findElement(lnk_gmail);
        System.out.println("Color of a button before mouse hover: "	+ googleSearchBtn.getCssValue("border-bottom"));
        Actions action = new Actions(driver);
        Thread.sleep(3000);
        action.moveToElement(googleSearchBtn).build().perform();
        System.out.println("Color of a button after mouse hover : "	+ googleSearchBtn.getCssValue("border-bottom"));
    }

    @Test(priority=2)
    public void getCssValue_ButtonFontSize() {
        WebElement googleSearchBtn = driver.findElement(bySearchButton);
        System.out.println("Font Size of a button "	+ googleSearchBtn.getCssValue("font-size"));
    }

    @Test(priority=3)
    public void getCssValue_ButtonFontWeight(){
        WebElement googleSearchBtn = driver.findElement(bySearchButton);
        System.out.println("Font Weight of a button "	+getFontWeight(googleSearchBtn) );
    }

    public String getFontWeight(WebElement element) {
        //Output will return as 400 for font-weight : normal, and 700 for font-weight : bold
        return element.getCssValue("font-weight");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
