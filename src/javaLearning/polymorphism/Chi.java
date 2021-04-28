package javaLearning.polymorphism;

public class Chi extends Par{
	void m1() // overriding method
	{
		System.out.println("this is chi m1");
	}
	void m2() // direct method
	{
		System.out.println("this is chi m2");
	}
	void stat()
	{
		System.out.println("this child static method");
	}
	
	void priv(){
		System.out.println("this is child private method");
	}
	
	public void prot(){
		System.out.println("this is child protected method");
	}
	public static void main(String[] args) {
		
		//Possibilities of creating Objects
		Chi c= new Chi(); // child class object with child class reference variable
		c.m1();
		Par p= new Par(); // parent class object with parent class reference variable
		p.m1();
		Par Par= new Chi(); // we can assign parent class reference variable to child class object
		Par.m1(); //During compile time it checks whether m1() method present in Par and since object created for Chi it executes child class m1() hence obtaining Polymorphism
		/*Chi c= new Par();*/ //invalid not possible
		
		//Type casting to call m2() using Par reference variable
		
		Chi ch=(Chi)Par;
		ch.m2();
		// Rule 5 - we cannot override static methods in Parent
		p.sta(); // parent reference variable with parent class object
		Par.sta(); // Parent reference variable with child class object
		
		// Rule 6- we cannot see private methods from parent class in child class.Hence they cannot be overridden
		/*Par.priv();*/ //the method priv() from the type Par is not visible
		
		// Rule 7- we can override methods maintaining same lever or increasing order
		Par.prot();
		ch.prot();
		
	}

}
