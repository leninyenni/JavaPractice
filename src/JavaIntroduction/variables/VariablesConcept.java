package JavaIntroduction.variables;

public class VariablesConcept {
	
	int x=100;// instance variables
	int y=200;//instance variables memory allocated when object creation
	int b=2000;
	static  int z=500;

	void display() // instance method
	{
		int x = 10;// local variables
		int b = 20;//local variables memory allocated during method invoking
//		System.out.println(b);
//		System.out.println(x);//instance variables can be accessed in instance areas i.e methods/Constructors/blocks
//		System.out.println(this.z);//static variables memory created when .class file loading
		System.out.println(this.x);//this keyword used to refer instance variables
		System.out.println(x);
		
		
	}

	public static void main(String[] args) {
		VariablesConcept LC = new VariablesConcept();
		VariablesConcept VC=new VariablesConcept();
		LC.x = 700;
		VC.x = 9000;
		LC.display();
		VC.display();
		System.out.println(LC.b);
		/*System.out.println(VC.y);//instance variables can be accessed using object creation
		System.out.println(z);//static variables can be accessed using class name any where in the class
*/	}

}
