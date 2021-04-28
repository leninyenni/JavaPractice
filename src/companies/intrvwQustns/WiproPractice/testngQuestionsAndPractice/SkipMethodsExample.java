package companies.intrvwQustns.WiproPractice.testngQuestionsAndPractice;
import org.testng.SkipException;
import org.testng.annotations.Test;
public class SkipMethodsExample {
	@Test(enabled = false)
	public void testCaseEnabling() {
		System.out.println("I'm Not Ready, please don't execute me");
	}
	/*
	 * @Test public void testCaseSkipException(){
	 * System.out.println("Im in skip exception"); throw new
	 * SkipException("Skipping this test method explicitly"); }
	 */
	@Test
	public void testCaseConditionalSkipException() {
		System.out.println("Im in Conditional Skip");
		boolean DataAvailable = true;
		if (DataAvailable = true) {
			throw new SkipException("Skipping this exception from conditional class");
		}
		System.out.println("Executed Successfully");
	}
}
