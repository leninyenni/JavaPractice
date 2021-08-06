package seleniumPrograms.RandomThoughts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class zodiacCompatability {
    WebDriver driver;
    String[] zodiacSigns;

    @BeforeTest
    public void launchSite()
    {
        System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\updatedchrome\\chromedriver.exe");
        driver = new ChromeDriver();
        //enter the url
        driver.get("https://www.astrology-zodiac-signs.com/compatibility/aries-aries/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test(dataProvider = "myDataProvider")
    public void checkCompatability(String sign)
    {
        for (String value: zodiacSigns )
        {
            Map<String, String> mapOfResults= new HashMap<>();
            String url ="https://www.astrology-zodiac-signs.com/compatibility/"+value+"-"+sign+"/";
            driver.navigate().to(url);
            int j=0;
            for (int i =2 ; i<8 ;i++)
            {
                String heading=driver.findElement(By.xpath("(//h2)["+i+"]")).getText();
                j=i-1;
                String percentage= driver.findElement(By.xpath("(//h3[@class='skills-tittle percentual'])["+j+"]")).getText();
                System.out.println(heading+"--"+percentage);
                mapOfResults.put(heading,percentage);
            }
            List<Map.Entry<String, String>> list = new ArrayList<>(mapOfResults.entrySet());
            list.sort(Map.Entry.comparingByValue());
            String maxValue= list.get(list.size()-1).getValue();
            String minValue= list.get(0).getValue();
            System.out.println("------------------------------------------------------------------------");
            System.out.println("The Best One/Ones Are : ");
            list.stream().filter(eachEntrySet->eachEntrySet.getValue().equals(maxValue)).forEach(System.out::println);
            System.out.println("The Worst One/Ones Are : ");
            list.stream().filter(eachEntrySet->eachEntrySet.getValue().equals(minValue)).forEach(System.out::println);
            System.out.println("------------------------------------------------------------------------");
                      // System.out.println("THE BEST ONE IS  :"+list.get(list.size()-1).getKey()+" WITH "+list.get(list.size()-1).getValue());

        }

    }
    @DataProvider
    public String[] myDataProvider()
    {
      WebElement zodiacDropDown= driver.findElement(By.id("sign1-menu"));
        Select selectZodiac= new Select(zodiacDropDown);

        List<WebElement> listOfDropDownValueWebElements=selectZodiac.getOptions();
        String [] listOfDropDownValues = new String[listOfDropDownValueWebElements.size()];
        for (int i=0;i<listOfDropDownValueWebElements.size();i++)
        {
            listOfDropDownValues[i]=listOfDropDownValueWebElements.get(i).getText().toLowerCase();
        }
        this.zodiacSigns=listOfDropDownValues;

        // Passing 3 set of data and each set contains single value
       // return new String[] { "aries", "taurus" };
    return listOfDropDownValues;
    }

    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }

}
