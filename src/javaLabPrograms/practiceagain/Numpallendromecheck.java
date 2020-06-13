package javaLabPrograms.practiceagain;
import java.util.Scanner;
public class Numpallendromecheck {
	public static void main(String[] args) {
		System.out.println("enter a num to check:");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		int temp=num;
		int rem, sum = 0;
		while (temp != 0) {
			rem = temp % 10;
			sum = sum * 10 + rem;
			temp = temp / 10;
		}
		
		if(sum==num)
		{
			System.out.println("its a pallendrome number");
		}
		else
		{
			System.out.println("not a pallendrome number");
		}
	}
}
