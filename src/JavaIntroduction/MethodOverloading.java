package JavaIntroduction;

public class MethodOverloading {
	int b;

	void m1(int a) {
		System.out.println("one arg int");
	}

	void m1(int a, int b) {
		System.out.println("two arg int");
	}

	void m1(char ch) {
		System.out.println("different datatype arg int");
	}

	MethodOverloading(int b) {
		this.b=b;
		System.out.println("one arg constructor");
	}

	MethodOverloading(char ch) {
		System.out.println("different arg constructor");
	}

	public static void main(String[] args) {
		new MethodOverloading('a');
		new MethodOverloading(100);
		/*new MethodOverloading(10).m1(10);*/
		System.out.println(new MethodOverloading(100).b+new MethodOverloading(100).b);// b value taken 100 since object created and passed value 100 to b
		System.out.println("rat"+"cat"); // operator over loading
		
	}

}
