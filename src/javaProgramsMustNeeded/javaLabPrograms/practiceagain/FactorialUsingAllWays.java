package javaProgramsMustNeeded.javaLabPrograms.practiceagain;
import java.util.Scanner;
public class FactorialUsingAllWays {
	public static int fact(int num) {
		while (num == 1) {
			return 1;
		}
		return num * fact(num - 1);
	}
	public static void main(String[] args) {
		System.out.println("enter a num to check:");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int result = fact(num);
		System.out.println("factorial of " + num + " is :" + result);
	}
}
