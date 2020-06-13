package javaProgramsMustNeeded;
import java.util.Scanner;
public class PrintStarInRightTriangeInverted {
	public static void main(String[] args) {
		System.out.println("enter n: ");
		Scanner S = new Scanner(System.in);
		int n = S.nextInt();
		for (int i = n; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
