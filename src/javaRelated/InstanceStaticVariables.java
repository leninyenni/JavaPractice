package javaRelated;

public class InstanceStaticVariables {
	int a = 10;
	double b = 2.5;
	static int x = 100;
	static double y = 25.01;

	void m1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}

	static void m2(InstanceStaticVariables ISV) {
		System.out.println(ISV.a);
		System.out.println(ISV.b);
		System.out.println(x);
		System.out.println(y);

	}

	public static void main(String[] args) {
		InstanceStaticVariables ISV= new InstanceStaticVariables();
		ISV.m1();
		m2(ISV);

	}

}
