package JavaIntroduction.abstraction.constructor.loopholes;
public class Test {
	Test(double d) { 
		this(10);
		System.out.println("double arg constructor");
	}
	Test(int i) {
		this();
		System.out.println("int arg constructor");
	}
	Test() {
		System.out.println("no arg constructor");
	}
	public static void main(String[] args) {
		Test t1 = new Test(10.5);
		Test t2= new Test(10);
		Test t3= new Test();
	}
}
