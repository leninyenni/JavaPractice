package flowControlStatements;

public class Example1 {
	
	public static void main(String[] args) {
	int a=10;
	if (a==10) //condition must be a boolean condition. 
	{
		System.out.println("true body");
	}
	else
	{
		System.out.println("false body");
	}
	if (true) // we can pass boolean values directly
	{
		System.out.println("execute if block");
	}
	else
	{
		System.out.println("execute else block");
	}
	if (true)
		System.out.println("true block"); 
	else
		System.out.println("false block");
	}	

}
