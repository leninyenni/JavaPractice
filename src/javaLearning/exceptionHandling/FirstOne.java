package javaLearning.exceptionHandling;

import java.util.Scanner;

public class FirstOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //created object for scanner
		doFuntion(input); // passing object to doFunction(Scanner input) method . Inorder to pass object we created method with arguments to pass Scanner object
		}
	static void doFuntion(Scanner input) {
		try {
			
			System.out.println("Enter first num:");
			int n1 = input.nextInt();
			System.out.println("Enter second num:");
			int n2 = input.nextInt();
			int output = n1 / n2;
			System.out.println("Output is:" + output);
		} catch (Exception e) {
			System.out.println("You can't do that buddy");
			doFuntion(input);
		}
	}

}
