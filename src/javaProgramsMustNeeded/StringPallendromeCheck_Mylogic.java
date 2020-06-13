package javaProgramsMustNeeded;
import java.util.Scanner;
public class StringPallendromeCheck_Mylogic {
	public static void main(String[] args) {
		System.out.println("enter your string here:");
		Scanner sc = new Scanner(System.in);
		String value = sc.nextLine();
		int reachpoint = value.length() / 2;
		for (int i = 1; i <= value.length()/2; i++) {
			if (value.charAt(i - 1) == value.charAt(value.length() - i)) {
				reachpoint++;
			}
		}
		if (reachpoint / 2 == value.length() / 2) {
			System.out.println("its a pallendrome");
		}
		else
		{
			System.out.println("its not pallendrome");
		}
	}
}