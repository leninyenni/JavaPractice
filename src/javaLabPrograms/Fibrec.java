package javaLabPrograms;
import java.util.Scanner;
/*The Fibonacci sequence is defined by the following rules: The first two values in the sequence are 1
and 1. Every subsequent values is the sum of the two values preceding it. Write a java program that
uses both recursive and non recursive functions to print the nth value in the Fibonacci sequence.
*/
public class Fibrec {
	public static void main(String[] args) throws Exception {
		int n;
		long r = 0;
		System.out.println("Enter N value:");
		Scanner dis = new Scanner(System.in);
		n = dis.nextInt();
		Fibonacci f = new Fibonacci();
		for (int i = 1; i <= n; i++) {
			System.out.print(f.Fib(i) + "\t");
			r = f.Fib(n);
		}
		System.out.println("\nThe " + n
				+ " the value in the Fibonacci Series : " + r);
		dis.close();
	}
}
