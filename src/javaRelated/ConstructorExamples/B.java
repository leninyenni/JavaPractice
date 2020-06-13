package javaRelated.ConstructorExamples;

public class B {

	B() {

		System.out.println("B Class Constructor ");
		

	}
	B(int a)
	{
		System.out.println("int");
	}
	
	
	  /*B b= new B(); recursion being occured since object is being created and since object created variables getting initialized*/
 	 
	
	public static void main(String[] args) {

		B ob = new B(25); // when object B was created for Child Class B, automatically Super class constructors get called
		try {
			Class.forName("javaRelated.ConstructorExamples.A");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
