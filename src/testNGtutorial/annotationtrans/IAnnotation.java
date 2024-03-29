package testNGtutorial.annotationtrans;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


public class IAnnotation implements IAnnotationTransformer {
    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod)
    {
        if(testMethod.getName().equalsIgnoreCase("itest1"))
        {
            annotation.setDataProviderClass(IAnnotationDataProvider.class);
            annotation.setDataProvider("dataprovider1");
        }
        if(testMethod.getName().equalsIgnoreCase("itest2"))
        {
            annotation.setDataProviderClass(IAnnotationDataProvider.class);
            annotation.setDataProvider("dataprovider2");
        }
    }
}
