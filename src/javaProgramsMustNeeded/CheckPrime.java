package javaProgramsMustNeeded;

import java.util.Scanner;

public class CheckPrime {
	public static void main(String[] args) {
		
		System.out.println("enter your integer here other more than 1:");
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		
		int count=0;
		
		for (int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				count++;
				//count=1;
				//System.out.println("Entered number is not a prime number");
				//break;
			}
		}
		if (count==0)
		{
			System.out.println("entered number is prime"); //we can write this statement inside if loop and a break statement like commented way
		}
		else
		{
			System.out.println("not prime");
		}
		
	}
	
}
