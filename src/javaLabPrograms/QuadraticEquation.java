package javaLabPrograms;
import java.util.Scanner;
/*Write a Java program that prints all real solutions to the quadratic equation ax2+bx+c=0.
Read in a ,b, c and use the quadratic formula. If the discriminate b2-4ac is negative, display
a message stating that there are no real solutions.*/

public class QuadraticEquation {
	public static void main(String[] args) throws Exception {
		int a, b, c, d;
		float r1, r2;
		System.out.println("Enter a , b & c values");
		Scanner dis = new Scanner(System.in);
		a = dis.nextInt();
		b = dis.nextInt();
		c = dis.nextInt();
		d = (b * b) - (4 * a * c);
		if (d == 0) {
			r1 = r2 = (float) (-b / (2 * a));
			System.out.println("The roots are equal\nr1=" + r1 + " and r2="
					+ r2);
		} else if (d > 0) {
			r1 = (float) (-b + Math.sqrt(d)) / (2 * a);
			r2 = (float) (-b - Math.sqrt(d)) / (2 * a);
			System.out.println("The roots are real & distinct\n r1=" + r1
					+ " and r2=" + r2);
		} else if (d < 0) {
			r1 = (float) (-b / (2 * a));
			r2 = (float) (Math.sqrt(-d) / (2 * a));
			System.out.println("The roots are complex & imaginary\nr1=" + r1
					+ "+i" + r2 + "\nr2=" + r1 + "-i" + r2);
		}
		dis.close();
	}
}
