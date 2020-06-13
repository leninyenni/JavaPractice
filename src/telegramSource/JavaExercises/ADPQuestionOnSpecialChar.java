package telegramSource.JavaExercises;
import java.util.Arrays;
public class ADPQuestionOnSpecialChar {
	// check if special character is having its closed one or not
	// if each bracket has its closed then tell the count
	static int countTheChars(String input, char openbrac, char closebrac) {
		int openbracketcount = 0;
		int closedbracketcount = 0;
		char[] ch = input.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == openbrac) {
				openbracketcount++;
			} else if (ch[i] == closebrac) {
				closedbracketcount++;
			}
		}
		if (openbracketcount == closedbracketcount) {
			System.out.println("all "+openbrac+"and "+closebrac+"  brackets are paired up");
			return 0;
		} else if (openbracketcount >= closedbracketcount) {
			int diff = openbracketcount - closedbracketcount;
			System.out.println("open  "+openbrac+ "   brackets left are :" + diff);
			return diff;
		} else {
			int diff = closedbracketcount - openbracketcount;
			System.out.println("closed  "+closebrac+ "   brackets left are :" + diff);
			return diff;
		}
	}
	public static void main(String[] args) {
		String str = "[({{{)]}(()))))";
		countTheChars(str, '{', '}');
		System.out.println(" ");
		countTheChars(str, '[', ']');
		System.out.println(" ");
		countTheChars(str, '(', ')');
	}
}
