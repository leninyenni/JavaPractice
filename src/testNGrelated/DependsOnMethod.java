package testNGrelated;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsOnMethod {

    public int a=10;

    @Test()
    public void launchGoogle()
    {
        System.out.println(a);
    }
}
