package JavaIntroduction.ConstructorExamples;

public class Test2 {
	
	static {
		System.out.println("stat");
	}
	
	{
		
		System.out.println("non");
	}
	
	Test1 t1= new Test1(5); // creating reference variable for Test1 class
	
	Test2 (int a) // Constructor
	{
		
		Test2 t2= new Test2(10); 
		
		System.out.println("Constructor in Test2");
	}

	public static void main(String[] args) {
		// creating object for Test2 . Test2 constructor being called when object was created and Test1 constructor got executed when t1 was initiated
		Test2 t2= new Test2(10); 
		
	}

}
