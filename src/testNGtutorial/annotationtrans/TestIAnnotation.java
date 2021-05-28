package testNGtutorial.annotationtrans;

import org.testng.annotations.Test;

public  class TestIAnnotation{
    @Test
    public  void itest1(int i,int j)
    {
        System.out.println(i+"&"+j);
    }
    @Test
    public  void itest2(String name)
    {
        System.out.println(name);

    }

}
