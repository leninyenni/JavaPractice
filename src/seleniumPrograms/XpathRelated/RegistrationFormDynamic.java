package seleniumPrograms.XpathRelated;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class RegistrationFormDynamic {
    WebDriver driver;

    //utility method to read data from any excel in key and value format
    @DataProvider(name = "data-from-excel-hashmap")
    public Object[][] dataSupplier() throws IOException {
        File file = new File("D:\\Testdata\\textfiles\\userdata.xls");
        FileInputStream fis = new FileInputStream(file);
        HSSFWorkbook wb = new HSSFWorkbook(fis);
        HSSFSheet sheet = wb.getSheetAt(0);
        wb.close();
        int lastRowNum = sheet.getLastRowNum();
        int lastCellNum = sheet.getRow(0).getLastCellNum();
        Object[][] obj = new Object[lastRowNum][1];
        for (int i = 0; i < lastRowNum; i++) {
            Map<Object, Object> mapper = new LinkedHashMap<>();
            for (int j = 0; j < lastCellNum; j++) {
                mapper.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i + 1).getCell(j).toString());
            }
            obj[i][0] = mapper;
            System.out.println(mapper);
        }
        return obj;
    }

    public void selectValueFromDropDown(WebElement dropDownName, String dropDownValue) {
        Select drop = new Select(dropDownName);
        drop.selectByVisibleText(dropDownValue);
    }

    @Test(dataProvider = "data-from-excel-hashmap")
    public void runWithData(HashMap<String, String> data) throws InterruptedException {
        if (data.get("Run Mode").equals("Y")) {
            System.setProperty("webdriver.chrome.driver",
                    "D:\\Drivers\\updatedchrome\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("http://demo.automationtesting.in/Register.html");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(data.get("Full Name"));
            driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(data.get("Last Name"));
            driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(data.get("Address"));
            driver.findElement(By.xpath("//input[@type='email']")).sendKeys(data.get("Email Address"));
            driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(data.get("Phone"));
            System.out.println(data.get("Gender"));
            driver.findElement(By.xpath("//input[@type='radio'][@value='" + data.get("Gender") + "']")).click();
            driver.findElement(By.xpath("//input[@value='" + data.get("Hobbies") + "']")).click();
            driver.findElement(By.xpath("//label[text()='Languages']//following-sibling::div")).click();
            driver.findElement(By.xpath("(//label[text()='Languages'])//following::div/multi-select/div[2]/ul/li/a[text()='" + data.get("Languages") + "']")).click();
            //this is not working because of site issue
        /*WebElement languages= driver.findElement(By.id("msdd"));
        languages.click();
        languages.sendKeys(Keys.ARROW_DOWN);
        languages.sendKeys(Keys.ARROW_DOWN);
        languages.sendKeys(Keys.ENTER);*/
            driver.findElement(By.xpath("(//body)[1]")).click();
            WebElement skillsdropdown = driver.findElement(By.id("Skills"));
            WebElement countries = driver.findElement(By.id("countries"));
            WebElement year = driver.findElement(By.id("yearbox"));
            WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
            WebElement day = driver.findElement(By.id("daybox"));
            selectValueFromDropDown(skillsdropdown, data.get("Skills"));
            selectValueFromDropDown(countries, data.get("Country"));
            selectValueFromDropDown(year, data.get("year"));
            selectValueFromDropDown(month, data.get("Month"));
            selectValueFromDropDown(day, data.get("Day"));
            Thread.sleep(2000);
            driver.findElement(By.id("firstpassword")).sendKeys(data.get("Password"));
            driver.findElement(By.id("secondpassword")).sendKeys(data.get("Password"));
        } else {
        }
    }

    @AfterMethod
    public void tearDown() {
        if (driver == null) {
            System.out.println("No driver initialized");
        } else {
            driver.close();
        }

    }
}
