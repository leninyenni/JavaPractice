package seleniumPrograms.assignments.SpiceJetRelated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SpicePageValidations extends SpiceJetAutomation {
    public WebDriver driver;

    @Test(description = "Verify URL")
    public void test1() {
        driver.get("http://spicejet.com");
    }

    @Test(description = "Verify BookAFlight")
    public void test2() {
        driver.findElement(By.linkText("Flights")).click();
    }

    @Test(description = "verify flow of selections")
    public void test3() throws Exception {
        WebElement destinationlabel = driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']"));
        drawBorder(destinationlabel, driver);
        destinationlabel.click();
        Thread.sleep(6000);
        //if you see the select tag it is in style="display:none" . because of which if we use select tag to identify
        //it will give element not interactable exception
        //reference : https://www.w3schools.com/jsref/prop_style_display.asp#:~:text=However%2C%20if%20you%20set%20display,its%20original%20position%20and%20size.
        WebElement fromcity = driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR']//a[@value='BLR']"));
        drawBorder(fromcity, driver);
        fromcity.click();
        Thread.sleep(2000);
        WebElement tocity = driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']"));
        drawBorder(tocity, driver);
        tocity.click();
        Thread.sleep(2000);
        WebElement element = driver.findElement(By
                .id("ctl00_mainContent_txt_Fromdate"));
        //give the date you want to select
        String dateValue = "10-05-2021";
        //give the day you want to select
        int day = 10;
        selectDateByJS(driver, element, dateValue);
        driver.findElement(By.xpath("//a[text()=" + day + "]")).click();
        WebElement passlist = driver.findElement(By.id("divpaxinfo"));
        drawBorder(passlist, driver);
        passlist.click();
        new Select(driver.findElement(By.name("ctl00$mainContent$ddl_Adult"))).selectByVisibleText("2");
        new Select(driver.findElement(By.name("ctl00$mainContent$ddl_Child"))).selectByVisibleText("1");
        WebElement search = driver.findElement(By.name("ctl00$mainContent$btn_FindFlights"));
        drawBorder(search, driver);
        search.click();
    }


    @Test(description = "Currency Convertor")
    public void test4() throws Exception {
        Thread.sleep(4000);
        String windowName = driver.getWindowHandle();
        driver.findElement(By.linkText("Currency Converter")).click();
        WebElement dropdownbasecurrency=driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListBaseCurrency"));
        scrollIntoView(dropdownbasecurrency,driver);
        new Select(dropdownbasecurrency).selectByVisibleText("US Dollar(USD)");
        new Select(driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListConversionCurrency"))).selectByVisibleText("Indian Rupee(INR)");
        driver.findElement(By.id("CurrencyConverterCurrencyConverterView_TextBoxAmount")).sendKeys("100");
        Thread.sleep(1000);
    }

    @BeforeTest //Precondition
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver",
                "C://Users//91939//drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }

}
