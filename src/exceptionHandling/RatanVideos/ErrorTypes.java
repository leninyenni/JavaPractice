package exceptionHandling.RatanVideos;
public class ErrorTypes {
	
	void m1()
	{
		m2();
	}
	
	void m2()
	{
		m1();
	}
	public static void main(String[] args) {
		//StackOverflow error-- calling m1() method
		//NoClassDefFoundError-- if .class not available and when we call it using new keyword
		
		
		int n=10;
		assert n>20:"fail condition"; //assertion erro
		System.out.println("rest of the app");
	}
}
