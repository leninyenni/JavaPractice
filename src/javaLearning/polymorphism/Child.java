package javaLearning.polymorphism;

public class Child extends Parent {
	void marry() // overriding method
	{
		System.out.println("red girl");
	}
	
	int m1() // return type integer
	{
		System.out.println("child int method");
		return 20;
	}
	Dog m2()
	{
		System.out.println("red girl");
		return new Dog();
	}
	
	public static void main(String[] args) {
		/*new Child().marry();*/ // rule 1
		//rule 2
		/*int a=new Child().m1(); // since m1() return type is int hence stored in int type a
		System.out.println(a);*/ // to check the return value 
		//rule 3
		/*Dog d=new Child().m2(); // instance created with Dog class since its type is Dog
		System.out.println(d);*/ // to check the reurn value of m2() method which is of object type
		

	}

}
