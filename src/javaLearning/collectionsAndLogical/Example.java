package javaLearning.collectionsAndLogical;
public class Example {
	int x = m1();
	int m1() {
		System.out.println("x variable is executed");
		return 30;
	}
	int m2() {
		System.out.println("y variable is executed");
		return 30;
	}
	{
		System.out.println("NSB");
		m3();
	}
	public static void main(String args[]) {
		System.out.println("main");
		Example e = new Example();
		e.m3();
	}
	Example() {
		System.out.println("constructor");
	}
	void m3() {
		System.out.println("m3");
	}
	int b = m2();
	void m4() {
		System.out.println("m4");
	}
}
