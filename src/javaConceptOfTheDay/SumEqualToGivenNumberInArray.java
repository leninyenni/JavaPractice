package javaConceptOfTheDay;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SumEqualToGivenNumberInArray {
	public static void main(String[] args) {
		int sum = 0;
		int[] array = { 1, 2, 4, 7, 5 };
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the sum you want equal to:");
		int a = input.nextInt();
		List<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				sum = array[i] + array[j];
				if (sum == a) {
					al.add(array[i]);
					al.add(array[j]);
				}
			}
		}
		System.out.println(al);
	}
}
