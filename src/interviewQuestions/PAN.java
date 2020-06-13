package interviewQuestions;

import java.util.Scanner;

public class PAN {

	int pan;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter length of pan:");
		int length = input.nextInt();

		int[] Array = new int[length];

		System.out.println("first:");
		Array[0] = input.nextInt();

		for (int i = 1; i < length;) {
			System.out.println("Enter number " + i);
			int temp = input.nextInt();
			while (!check(Array, temp, i)) {
				System.out.println("Wrong Number");
				temp = input.nextInt();
			}			
			i++;
		}

		for (int i = 0; i < length; i++) {
			System.out.println(Array[i]);
		}

	}

	private static boolean check(int[] array, int checkNumber, int index) {
		boolean isValid = true;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == checkNumber) {
				isValid = false;
				break;
			}
		}
		if (isValid) {
			array[index] = checkNumber;
		}
		return isValid;
	}
}
