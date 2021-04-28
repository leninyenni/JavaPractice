package interviewQuestions.telegramSource.InterviewPrograms;
public class StrRevWithRecursion {
	public static void main(String[] args) {
		String s = "Mahabharat";
		StrRevWithRecursion rec = new StrRevWithRecursion();
		String rev = rec.revRecurse(s);
		System.out.println(rev);
	}
	public String revRecurse(String myStr) {
		if (myStr == null || myStr.length() < 1) {
			return myStr;
		}
		return revRecurse(myStr.substring(1)) + myStr.charAt(0);
	}
}
