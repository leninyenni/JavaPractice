package javaLabPrograms.practiceagain;
import java.util.Scanner;
public class StringPallendromeCheck {
	public static void main(String[] args) {
		System.out.println("enter a string you want to check:");
		Scanner input = new Scanner(System.in);
		String toCheck = input.nextLine();
		StringBuffer sb = new StringBuffer(toCheck);
		String obtained = sb.reverse().toString();
		if (toCheck.equals(obtained)) {
			System.out.println("its a pallendrome");
		} else {
			System.out.println("not a pallendrome");
		}
	}
}
