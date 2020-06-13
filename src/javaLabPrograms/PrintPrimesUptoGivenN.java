package javaLabPrograms;
import java.util.Scanner;
public class PrintPrimesUptoGivenN {
	public static void main(String[] args) {
		System.out.println("enter the number till u want to print primes:");
		Scanner s = new Scanner(System.in);
		int count = 0;
		int num = s.nextInt();
		if (num == 2) {
			System.out.println("its a prime number");
		} else if (num != 2)
			for (int i = 2; i <= num; i++) {
				count = 1;
				for (int j = 2; j <= i; j++) {
					if (i % j == 0)
						count++;
				}
				if (count == 2) {
					System.out.print(i + "\t");
				}
			}
	}
}
