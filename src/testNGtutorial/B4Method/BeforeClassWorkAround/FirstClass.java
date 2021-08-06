package testNGtutorial.B4Method.BeforeClassWorkAround;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstClass {

    @BeforeClass
    public void methodOne()
    {
        System.out.println("fist class before class annotated");
    }
    @Test
    public void test()
    {
        System.out.println("first class test method");
    }
}
