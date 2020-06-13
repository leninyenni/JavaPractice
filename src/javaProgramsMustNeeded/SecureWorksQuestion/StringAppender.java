package javaProgramsMustNeeded.SecureWorksQuestion;
import java.util.Scanner;
public class StringAppender {
	static int a = 0;
	static String stringappn(String str, int n) {
		if (n <= str.length()) {
			String str1 = str.substring(n);
			System.out.println(str1);
			String str2 = str.substring(0, n);
			System.out.println(str2);
			StringBuffer strb1 = new StringBuffer(str1);
			StringBuffer strb2 = new StringBuffer(str2);
			return strb1.append(strb2).toString();
		} else if (n == 0) {
			return str;
		} else {
			a = n % str.length();
			return "resultant "+stringappn(str, a);
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter string here:");
		String inputstr = s.nextLine();
		System.out.println("enter index to cut :");
		int index = s.nextInt();
		String strnew1 = stringappn(inputstr, index);
		System.out.println("resultant string is :" + strnew1);
	}
}
