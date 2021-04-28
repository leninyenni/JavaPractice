package javaLabPrograms.javaExercises;

import java.util.Scanner;

public class InputandDisplay {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter password:");
		String password= input.nextLine();
		System.out.println("Your password is:"+password);
	}

}
