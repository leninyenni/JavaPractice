package instanceOfOperator;

public class Test extends Test1{
	
	public static void main(String[] args)
	{
		
		Test t= new Test();
		Test1 t1= new Test1();
		
		System.out.println(t1 instanceof Test);
	}
}
