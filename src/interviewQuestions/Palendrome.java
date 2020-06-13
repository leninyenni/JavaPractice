package interviewQuestions;

import java.util.Scanner;

public class Palendrome {
	
	static int x;
	static int a=0;
	

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter number:");
		int num=input.nextInt();
		int check=num;
		while(num>0)
		{
			x=num%10;
			a=a*10+x;
			num=num/10;
		}
		System.out.println(a);
		if (a==check)
			System.out.println("Its Pallendrome");
		else
		System.out.println("not pallendrome");	
			
	}

}
