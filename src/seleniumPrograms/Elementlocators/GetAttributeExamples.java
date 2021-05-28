package seleniumPrograms.Elementlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GetAttributeExamples {

    @Test
    public void fromGoogle() {
        System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        WebElement searchTextBox = driver.findElement(By.name("q"));
        // retrieving html attribute value using getAttribute() method
        String titleValue = searchTextBox.getAttribute("title");
        System.out.println("Value of title attribute: " + titleValue);
        String autocompleteValue = searchTextBox.getAttribute("autocomplete");
        System.out.println("Value of autocomplete attribute: " + autocompleteValue);
        // Retrieving value of attribute which does not exist
        String nonExistingAttributeValue = searchTextBox.getAttribute("nonExistingAttribute");
        System.out.println("Value of nonExistingAttribute attribute: " + nonExistingAttributeValue);
        String role = searchTextBox.getAttribute("role");
        System.out.println("Value of nonExistingAttribute attribute: " + role);
    }



    private String baseUrl = "http://docs.seleniumhq.org/docs/03_webdriver.jsp#introducing-the-selenium-webdriver-api-by-example";

    @Test
    public void findElements() {
        System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.chercher.tech/java/index-selenium-webdriver");
        String bgColor = driver.findElement(By.xpath("//h2[text()='Selenium Architecture']")).getCssValue("color");
        System.out.println("Css Value for background color is : "+ bgColor);

        String bgImage = driver.findElement(By.xpath("//h2[text()='Selenium Architecture']")).getCssValue("background-image");
        System.out.println("Css Value for background color is : "+ bgImage);


        String bgColor1 = driver.findElement(By.xpath("//h2[text()='Selenium Architecture']")).getCssValue("background-color");
        System.out.println("Css Value for background color is : "+ bgColor1);



        }
}
