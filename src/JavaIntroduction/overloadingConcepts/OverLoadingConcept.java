package JavaIntroduction.overloadingConcepts;

public class OverLoadingConcept {
	
	void add ()
	{
		System.out.println("addition");
	}
	
	void add(int a)
	{
		System.out.println(a*a);
	}
	
	void add(int a, String str)
	{
		System.out.println("My number is"+"-"+a+"-"+str);
	}
	

	
	public static void main(String[] args) {
		
		OverLoadingConcept olc= new OverLoadingConcept();
		olc.add();
		olc.add(5);
		olc.add(1, "Lenin");
			
	}
}
