package companies.intrvwQustns.medtronicExam;
import java.util.Scanner;
public class arrayconver {
	static int[] cutArrayAtIndexOf(int[] a, int num) {
		num=num%a.length;
		int[] result = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			if (i + num < a.length) {
				result[i] = a[i + num];
			} else {
				result[i] = a[i + num - a.length];
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] inputArray = { 1, 2, 3, 5, 4 };
		Scanner s= new Scanner(System.in);	
		System.out.println("enter range to cut:");
		int splitAtIndex = s.nextInt();
		int[] fin = cutArrayAtIndexOf(inputArray, splitAtIndex);
		System.out.println("after cutting:");
		for (int a : fin) {
			System.out.println(a);
		}
	}
}
