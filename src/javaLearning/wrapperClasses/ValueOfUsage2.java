package javaLearning.wrapperClasses;
public class ValueOfUsage2 {
	public static void main(String arg[]) {
		char[] data = { 'G', 'E', 'E', 'K', 'S', ' ', 'F', 'O', 'R', ' ', 'G',
				'E', 'E', 'K', 'S' };
		String sample;
		// Returns the string representation
		// of a specific subarray of the chararray argument
		sample = String.valueOf(data, 0, 15);
		System.out.println(sample);
		// Returns the string of charArray 0 to 5
		sample = String.valueOf(data, 0, 5);
		System.out.println(sample);
		// Returns the string of charArray starting
		// index 6 and total count from 6 is 8
		sample = String.valueOf(data, 6, 8);
		System.out.println(sample);
		
		int a=10;
		Integer i= Integer.valueOf(a);
		System.out.println(i);
		String s=String.valueOf(a); //value of method is overloaded in String's value of method and it returns String form of an integer
		System.out.println(s);
		
	}
}
