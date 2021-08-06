package companies.intrvwQustns.WellsFargo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgExceptionClass {
    private String message;

    //Constructor
    //@param message to be printed
    public TestNgExceptionClass(String message) {
        this.message = message;
    }

    // prints the message
    public void printMessage() {
        System.out.println(message);
        int a = 0;
        int b = 1 / a;
        System.out.println("hello world");
    }

    // add "Hi!" to the message
    public String salutationMessage() {
        message = "Hi!" + message;
        System.out.println(message);
        return message;
    }


    @Test(expectedExceptions = ArithmeticException.class)
    public void testPrintMessage() {
        TestNgExceptionClass testNgExceptionClass = new TestNgExceptionClass("Manisha");
        System.out.println("Inside testPrintMessage()");
        testNgExceptionClass.printMessage();
        System.out.println("hello wrold");
    }

    @Test
    public void testSalutationMessage() {
        TestNgExceptionClass testNgExceptionClass = new TestNgExceptionClass("Manisha");
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Manisha";
        Assert.assertEquals(message, testNgExceptionClass.salutationMessage());
    }
}
