package javaProgramsMustNeeded;
import java.util.Scanner;
public class NumbercountInaString {
	static int DigitCounter(String s) {
		int count = 0;
		char[] ch = s.toCharArray();
		for (char c : ch) {
			if (Character.isDigit(c)) {
				count++;
			}
		}
		return count;
	}
	public static void main(String args[]) {
		System.out.println("Enter the length of the string:");
		Scanner inputNumber = new Scanner(System.in);
		
		System.out.println("Now enter string value");
		//Scanner inputString = new Scanner(System.in);
		String value = inputNumber.nextLine();
		System.out.println(value);
		int num = inputNumber.nextInt();
		System.out.println("length of string is" + num);
		//System.out.println(DigitCounter(value));
		
		System.out.println("apple".compareTo("banana"));
		
		     String message = "Hello";
		     for (int i=0; i<message.length(); i++){
		       System.out.print(message.charAt(i+1));
		     }
		   }
		 
	}

