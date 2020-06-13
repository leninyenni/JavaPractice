package javaProgramsMustNeeded;
import java.util.Scanner;
public class Palindrome {
 	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to check");
		String temp = "";
		String x = sc.nextLine();
		for (int i = 0; i < x.length(); i++) {
			temp = x.charAt(i) + temp;
			//System.out.println(temp); jus for checking appending is working
		}
		if (x.equals(temp)) {
			System.out.println("The given string is palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}
}
