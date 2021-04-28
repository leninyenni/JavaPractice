package javaLearning.polymorphism;

public class Parent {
	void marry() // overridden method
	{
		System.out.println("black one");
	}
	
	int m1()
	{
		System.out.println("Parent int type");
		return 10;
	}
	Animal m2()
	{
		System.out.println("black girl");
		return new Animal();
	}
	final void m3() // this method cannot be called since final modifier is used
	{
		System.out.println("final method");
	}
}
