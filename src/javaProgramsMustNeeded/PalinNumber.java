package javaProgramsMustNeeded;
import java.util.Scanner;
public class PalinNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to check");
		int x = sc.nextInt();
		int temp = x;
		int sum = 0;
		int r = 0;
		while (temp > 0) {
			r = temp % 10;
			sum = (sum * 10) + r;
			temp = temp / 10;
		}
		if (x == sum) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}
}
