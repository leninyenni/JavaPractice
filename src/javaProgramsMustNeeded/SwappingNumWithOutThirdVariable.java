package javaProgramsMustNeeded;
import java.util.Scanner;
public class SwappingNumWithOutThirdVariable {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int a = sc.nextInt();
		System.out.println("enter second number");
		int b = sc.nextInt();
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("First number is:" + a + " "
				+ "and second number is" + " " + b);
	}
}
