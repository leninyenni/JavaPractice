package javaProgramsMustNeeded.javaLabPrograms.practiceagain;

import java.util.Arrays;

public class StringArrayInOrder {
	public static void main(String args[]) {
		String[] myArray = { "abc", "def", "aac", "ddef", "ghi",
				"aaa" };
		int size = myArray.length;
		
		//selection sort technique
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < myArray.length; j++) {
				if (myArray[i].compareTo(myArray[j]) > 0) {
					String temp = myArray[i];
					myArray[i] = myArray[j];
					myArray[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(myArray));
	}
}
