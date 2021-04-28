package javaLearning.inheritenceInFrame;

public class TestBase {
	
	int a;
	String s;
	{
		System.out.println("start executing");
	}
	
public TestBase(int x) {
	
	System.out.println("hello world"+x);
}

public void printA()
{
	System.out.println("this is from TestBase"+a);
}
	
	
}
