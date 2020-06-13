package learningConcepts;
public class TestOne {
	
	static TestThree testthree;
	
	public TestTwo TestOne() {
		return new TestTwo();
	}
	
	public TestOne()
	{
		System.out.println("helo world");
	}
	
	public static void main(String[] args) {
		TestOne to= new TestOne();
		to.TestOne();
		testthree= new TestThree();
		System.out.println(testthree.a);
	}
}
