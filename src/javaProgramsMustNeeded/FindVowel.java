package javaProgramsMustNeeded;
public class FindVowel {
	public static void main(String[] args) {
		String s = "india is a big country";
		int counter = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
					|| s.charAt(i) == 'o' || s.charAt(i) == 'u') {
				counter = counter + 1;
			}
		}
		System.out.println(counter);
	}
}
