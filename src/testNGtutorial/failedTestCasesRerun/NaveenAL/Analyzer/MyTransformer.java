package testNGtutorial.failedTestCasesRerun.NaveenAL.Analyzer;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
public class MyTransformer implements IAnnotationTransformer {
	@Override
	public void transform(ITestAnnotation annotation, Class testClass,
			Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(RetryAnalyzer.class); //we have to tell ITestAnnotation where our RetryAnalyzer class is there
	}
}
