 package abstraction;

public class Test2 extends Test1{
	// all four methods are implemented hence it is normal method. Total methods it can use are 4
	
	@Override
	void m2() {
		System.out.println("this is Test2 m2 method");
		
	}

	@Override
	void m3() {
		System.out.println("this is Test2 m3 method");
	}
	public static void main(String [] args){
		/*Test2  t2= new Test2();*/
		Test1 t1= new Test2();
		t1.m3(); //compiler checks whether m3() present in Test1 ; Run time executes m3() in Test2 class
	}

}
