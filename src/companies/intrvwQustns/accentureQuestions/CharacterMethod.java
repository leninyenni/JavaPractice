package companies.intrvwQustns.accentureQuestions;
public class CharacterMethod {
	public static void main(String[] args) {
		int codepoint1 = 55;
		int codepoint2 = 40;
		boolean check1 = Character.isDigit(codepoint1);
		boolean check2 = Character.isDigit(codepoint2);
		if (check1) {
			System.out.print("The codePoint \'" + codepoint1
					+ "\' is a digit.\n");
		} else {
			System.out.print("The codePoint \'" + codepoint1
					+ "\' is not a digit.\n");
		}
		if (check2) {
			System.out.print("The codePoint \'" + codepoint2
					+ "\' is a digit.\n");
		} else {
			System.out.print("The codePoint \'" + codepoint2
					+ "\' is not a digit.\n");
		}
	}
}
