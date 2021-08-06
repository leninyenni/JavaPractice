package javaProgramsMustNeeded.javaLabPrograms.practiceagain;
import java.util.Scanner;
public class SumOfPrimesToGivenRange {
	public static void main(String[] args) {
		System.out.println("enter range u want to check: ");
		Scanner inp = new Scanner(System.in);
		int num = inp.nextInt();
		int sum = 0;
		for (int i = 2; i < num; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println("sum of primes upto given range= " + sum);
	}
}
