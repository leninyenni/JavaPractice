package interviewQuestions.InterviewPrograms;
import java.util.Scanner;
public class ToCheckForPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to check:");
		int x = sc.nextInt();
		int counter = 0;
		for (int i = 2; i <= x / 2; i++) {
			if (x % i == 0) {
				counter = 1;
				System.out.println("Entered number is not a prime number");
				break;
			}
		}
		if (counter == 0)
			System.out.println("this is prime");
	}
}
