package testNGtutorial.inheritenceInAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SuperClass {

    @BeforeTest
    public void launch()
    {
        System.out.println("browser");
    }

    @Test
    public void aaa()
    {
        System.out.println("https://www.facebook.com");
    }
    @AfterTest
    public void closing()
    {
        System.out.println("paretn closing");
    }
}
