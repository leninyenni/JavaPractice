package inheritencConcepts;

public class ChildTwo extends Parent{
	
	void learn() // over riding method
	{
		System.out.println("dont want selenium");
	}
	
	public static void main(String[] args) {
		
		Parent P= new ChildTwo();
		P.learn();
	}
}