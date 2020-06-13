package sample;

public class Test2 {
	
	static int a=5;
	public static void main(String[] args) {

		Test2 test2= new Test2();
		test2.m1();
		System.out.println(a);
	}
	//even a is a static variable still we can access that in instance method as static variables are intialized during class loading
	void m1()
	{
		a=10;
	}

}
