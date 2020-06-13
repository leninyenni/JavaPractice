package javaExercises;

import java.util.Scanner;

public class ReverseAWord {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word = in.nextLine();
		reverse(word);
	}

	public static void reverse(String x) {
		char[] Chars = x.toCharArray();
		String result = "";
		for (int i = Chars.length - 1; i >= 0; i--) {
			result += Chars[i];
		}
		System.out.println(result);
	}

}
