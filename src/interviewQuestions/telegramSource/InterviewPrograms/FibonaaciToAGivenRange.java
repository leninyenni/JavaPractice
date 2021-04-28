package interviewQuestions.telegramSource.InterviewPrograms;
import java.util.Scanner;
public class FibonaaciToAGivenRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range");
		int first = 0;
		int sec = 1;
		int last = 0;
		int x = sc.nextInt();
		System.out.print(first + "," + sec + ",");
		String temp = "";
		for (int i = 1; i <= x; i++) {
			last = first + sec;
			first = sec;
			sec = last;
			temp = temp + last + ",";
		}
		System.out.println(temp.lastIndexOf(","));
		System.out.print(temp.substring(0, temp.lastIndexOf(",")));
	}
}