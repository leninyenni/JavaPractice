package seleniumPrograms.Notes;

import org.testng.annotations.Test;

public class TestParallelOne {
	@Test
	public void testCaseOne() {
		//Printing Id of the thread on using which test method got executed
		System.out.println("Test Case One with Thread Id:- "
				+ Thread.currentThread().getId());
	}

	@Test
	public void testCaseTwo() {
		////Printing Id of the thread on using which test method got executed
		System.out.println("Test Case two with Thread Id:- "
				+ Thread.currentThread().getId());
	}
	
	@Test
	public void testCaseThree() {
		////Printing Id of the thread on using which test method got executed
		System.out.println("Test Case three with Thread Id:- "
				+ Thread.currentThread().getId());
	}
	
	@Test
	public void testCaseFour() {
		////Printing Id of the thread on using which test method got executed
		System.out.println("Test Case four with Thread Id:- "
				+ Thread.currentThread().getId());
	}
}
