package javaProgramsMustNeeded;
import java.util.Scanner;
public class ArmstrongNumber {
	public static void main(String args[]) {
		System.out.println("enter your number here:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		while (temp != 0) {
			int reminder = temp % 10;
			sum = sum + reminder * reminder * reminder;
			temp = temp / 10;
		}
		
		if(sum==num)
		{
			System.out.println("Number is armstrong number as its sum of individual digits cube is equal to the same number");
		}
		else
		{
			System.out.println("Not an armstrong number");
		}
	}
}
