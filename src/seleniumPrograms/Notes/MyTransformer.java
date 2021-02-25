package seleniumPrograms.Notes;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.ITest;


public class MyTransformer implements IAnnotationTransformer {
	 
	public void transform(ITest annotation, Class testClass,
	      Constructor testConstructor, Method testMethod)
	  {
	    if ("invoke".equals(testMethod.getName())) {
	      annotation.setInvocationCount(5);
	    }
	  }

	public void transform(ITestAnnotation annotation, Class testClass,
			Constructor testConstructor, Method testMethod) {
		
		
	}
	}
