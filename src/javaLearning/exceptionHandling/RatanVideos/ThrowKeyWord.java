package javaLearning.exceptionHandling.RatanVideos;
import java.util.Scanner;
public class ThrowKeyWord {
	static void status(int age) throws InvalidAgeException {
		if (age > 20) {
			System.out.println("eligible for mrg");
		} else {
			throw new InvalidAgeException();
		}
	}
	static void status2(int age) throws InvalidAgeExceptionParameterized {
		if (age > 20) {
			System.out.println("eligible for mrg");
		} else {
			throw new InvalidAgeExceptionParameterized(
					"you are not eligible for marriage");
		}
	}
	public static void main(String[] args) throws InvalidAgeException,
			InvalidAgeExceptionParameterized {
		Scanner s = new Scanner(System.in);
		System.out.println("enter your age");
		int age = s.nextInt();
		ThrowKeyWord.status2(age);
	}
}
