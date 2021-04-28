package javaLearning.polymorphism;

public class Par {
	void m1() // overridden method
	{
		System.out.println("this is parent m1");
	}
	
	static void sta()
	{
		System.out.println("this is parent static method");
	}
	private void priv()
	{
		System.out.println("this is parent private method");
	
	}
	
	protected void prot(){
		System.out.println("this is parent protected method");
	}

}
