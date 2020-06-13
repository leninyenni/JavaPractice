package javaProgramsMustNeeded.SecureWorksQuestion;
public class StringWA {
	public static void main(String[] args) {
		String a = "word1 word2 word3 word4";
		int first = a.indexOf(" ");
		int second = a.indexOf(" ", first + 1);
		String b = a.substring(0, second);
		String c = b.substring(second);
		System.out.println(b);
		System.out.println(c);
		System.out.println("lenin");
		
		
		String bk=a.replace(" ", "");
		String ak=a.replaceAll("\\s+", "");
		System.out.println(ak);
		
		String s = "helloThisIsA1234Sample";
		s = s.replaceAll("\\D+","");
		System.out.println(s);
	}
}
