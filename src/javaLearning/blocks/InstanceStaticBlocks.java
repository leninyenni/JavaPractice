package javaLearning.blocks;

public class InstanceStaticBlocks {
	
	{ // executed before constructor calls and gets executed whenever an object is created
		System.out.println("this is instance block");
	}
	public InstanceStaticBlocks() //gets executed whenever an object is created
	{
		System.out.println("this is constructor");
	}

	 //this will be executed during .class file loading and its the first one to execute
	static 
	{
		System.out.println("this is static block");
	}

	public static void main(String[] args) {
		new InstanceStaticBlocks();
		new InstanceStaticBlocks();
		
		
	}

}
