package JavaIntroduction;

public class InstanceStaticDiff {
	int a=10;// instance variable
	static int b=20; //static variable
	
	void m1() // instance method..hence instance area
	{
		System.out.println(a); //instance variable accessible in instance area
		System.out.println(InstanceStaticDiff.b); //static variable accessed using class name
	}
	static void m2() //static method...hence static area
	{
		InstanceStaticDiff ISD=new InstanceStaticDiff();// Object created to access instance variable since its static area
		System.out.println(ISD.a);
		System.out.println(b);// static variable accessed in static area
		
	}
	public static void main(String[] args) {
		InstanceStaticDiff ISD= new InstanceStaticDiff(); //object created to access instance variable
		ISD.m1();
		InstanceStaticDiff.m2(); // static method accessible using class name-
	
		

	}

}
