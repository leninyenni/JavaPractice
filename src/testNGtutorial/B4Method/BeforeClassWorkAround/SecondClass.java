package testNGtutorial.B4Method.BeforeClassWorkAround;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SecondClass {
    @BeforeClass
    public void methodTwo()
    {
        System.out.println("sec class before class annotated");
    }
    @Test
    public void test()
    {
        System.out.println("sec class test method");
    }
}
