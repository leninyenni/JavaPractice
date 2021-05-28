package testNGtutorial.inheritenceInAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SubClass extends SuperClass{
    @Test
    public void aab()
    {
        System.out.println("https://www.google.com");
    }
    @AfterTest
    public void close()
    {
        System.out.println("child closing");
    }
}
