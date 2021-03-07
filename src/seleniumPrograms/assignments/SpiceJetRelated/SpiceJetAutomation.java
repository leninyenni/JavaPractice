package seleniumPrograms.assignments.SpiceJetRelated;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SpiceJetAutomation {
    public static WebDriver driver;

    public static void scrollPageDown(WebDriver driver) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    public static void drawBorder(WebElement element, WebDriver driver) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.border='3px solid green'", element);
    }

    public static void scrollIntoView(WebElement element, WebDriver driver) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C://Users//91939//drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        WebElement destinationlabel = driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']"));
        drawBorder(destinationlabel, driver);
        destinationlabel.click();

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
        //not required actually
        WebElement element = driver.findElement(By
                .id("ctl00_mainContent_txt_Fromdate"));
        //give the date you want to select
        String dateValue = "10-05-2021";
        //give the day you want to select
        int day = 10;
        selectDateByJS(driver, element, dateValue);
        driver.findElement(By.xpath("//a[text()=" + day + "]")).click();
        WebElement search = driver.findElement(By.name("ctl00$mainContent$btn_FindFlights"));
        drawBorder(search, driver);
        search.click();
/*

        WebElement fare= driver.findElement(By.xpath("(//*[@name='ControlGroupSelectView$AvailabilityInputSelectView$market1'])[7]"));
        drawBorder(fare,driver);
        fare.click();
*/
        scrollPageDown(driver);
        Thread.sleep(5000);
        WebElement continuetocontactpage = driver.findElement(By.xpath("//span[text()='Continue']"));
        drawBorder(continuetocontactpage, driver);
        continuetocontactpage.click();
        WebElement firstname = driver.findElement(By.xpath("//input[@id='CONTROLGROUPPASSENGER_ContactInputPassengerView_TextBoxFirstName']"));
        drawBorder(firstname, driver);
        firstname.sendKeys("Siri");
        WebElement lastname = driver.findElement(By.xpath("//input[@id='CONTROLGROUPPASSENGER_ContactInputPassengerView_TextBoxLastName']"));
        drawBorder(lastname, driver);
        lastname.sendKeys("Valli");
        WebElement phonenumber = driver.findElement(By.id("CONTROLGROUPPASSENGER_ContactInputPassengerView_TextBoxHomePhone"));
        drawBorder(phonenumber, driver);
        phonenumber.sendKeys("9848022338");
        WebElement emailid = driver.findElement(By.id("CONTROLGROUPPASSENGER_ContactInputPassengerView_TextBoxEmailAddress"));
        drawBorder(emailid, driver);
        emailid.sendKeys("lonesurvivor@hotmail.com");
        WebElement passfirstname = driver.findElement(By.xpath("//input[@id='CONTROLGROUPPASSENGER_PassengerInputViewPassengerView_TextBoxFirstName_0']"));
        drawBorder(passfirstname, driver);
        passfirstname.sendKeys("Siri");
        WebElement passlastname = driver.findElement(By.xpath("//input[@id='CONTROLGROUPPASSENGER_PassengerInputViewPassengerView_TextBoxLastName_0']"));
        drawBorder(passlastname, driver);
        passlastname.sendKeys("Valli");
        WebElement scmobile = driver.findElement(By.xpath("//input[@id='CONTROLGROUPPASSENGER_PassengerInputViewPassengerView_TextBoxEmailMobile_0']"));
        drawBorder(scmobile, driver);
        scmobile.sendKeys("9848022338");
        WebElement continuetonextpage = driver.findElement(By.xpath("//span[text()='Continue']"));
        continuetonextpage.click();
        Thread.sleep(10000);
        WebElement seatbtn = driver.findElement(By.id("SpiceMaxSeatBtn"));
        drawBorder(seatbtn, driver);
        seatbtn.click();
        WebElement seatbtncheckbox = driver.findElement(By.xpath("//input[@type='checkbox'][@class='SMaxSeatAddon']"));
        drawBorder(seatbtncheckbox, driver);
        seatbtncheckbox.click();
        WebElement paynow = driver.findElement(By.xpath("//span[text()='Pay Now']"));
        drawBorder(paynow, driver);
        paynow.click();
        Thread.sleep(5000);
        driver.quit();
    }

    public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value','" + dateVal + "');", element);
        //comment this line as already calendar window is being openend automatically
        //driver.findElement(By.className("ui-datepicker-trigger")).click();
    }
}
