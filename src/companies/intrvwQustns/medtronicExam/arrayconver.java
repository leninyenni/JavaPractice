package companies.intrvwQustns.medtronicExam;

import java.util.Scanner;

public class arrayconver {
	static int[] convertarr(int[] a, int num) {
		
		num=num%a.length;
		
		int[] res = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			if (i + num < a.length) {
				res[i] = a[i + num];
			} else {
				res[i] = a[i + num - a.length];
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 4 };
		Scanner s= new Scanner(System.in);	
		System.out.println("enter range to cut:");
		int cou = s.nextInt();
		int[] fin = convertarr(arr, cou);
		System.out.println("after cutting:");
		for (int a : fin) {
			System.out.println(a);
		}
	}
}
