package javaExercises;

import java.util.Scanner;

public class CountOfEverything {
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter your text:");
		String text=input.nextLine();
		CountOfEverything.count(text); //no need of using class name but its best practice to use classname reference for static method calling
	}

	public static void count(String x) {
		int numbers = 0, spaces = 0, letters = 0;
		char[] characters = x.toCharArray();

		for (int i = 0; i < characters.length; i++) {
			if (Character.isLetter(characters[i])) {
				letters++;
			}
			if (Character.isDigit(characters[i])) {
				numbers++;
			}
			if (Character.isSpace(characters[i])) {
				spaces++;
			}
		}
		System.out.println("Number of letters:"+letters);
		System.out.println("Number of digits:"+numbers);
		System.out.println("Number of spaces"+spaces);
	}	

}
