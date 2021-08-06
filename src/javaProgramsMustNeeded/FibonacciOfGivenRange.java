package javaProgramsMustNeeded;
import java.util.Scanner;
public class FibonacciOfGivenRange {
	public static void main(String[] args) {
		System.out.println("To Print first N fibonacci numbers, provide N here : ");
		Scanner sc = new Scanner(System.in);
		int first = 0;
		int second = 1;
		int last = 0;
		int num = sc.nextInt();
		String temp = "";
		System.out.print(first + "," + second + ",");
		for (int i = 1; i <= num; i++) {
			last = first + second;
			first = second;
			second = last;
			temp = temp + last + ",";
		}
		temp = temp.substring(0, temp.length() - 1);
		System.out.println(temp);
	}
}
