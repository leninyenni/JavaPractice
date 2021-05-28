package testNGtutorial.annotationtrans;

import org.testng.annotations.DataProvider;

public class IAnnotationDataProvider {


    @DataProvider(parallel = false)
    //we have to declare either static or should keep non arg constructor inside this
    public static Object[][] dataprovider1() {
        Object[][] ar = {{1, 2}, {3, 4}};
        return ar;
    }

    @DataProvider(parallel = false)
    public static Object[][] dataprovider2() {
        Object[][] sr = {{"selenium"}, {"testNG"}, {"maven"}};
        return sr;
    }
}
