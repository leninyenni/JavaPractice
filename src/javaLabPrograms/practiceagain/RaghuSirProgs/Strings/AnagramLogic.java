package javaLabPrograms.practiceagain.RaghuSirProgs.Strings;
import java.util.Arrays;
public class AnagramLogic {
	public static void main(String[] args) {
		String s1 = "MY name is khan";
		String s2 = "name is khan my";
		char[] c1 = s1.toCharArray();
		for (int i = 0; i < c1.length; i++) {
			if (Character.isUpperCase(c1[i])) {
				c1[i] = Character.toLowerCase(c1[i]);
			}
		}
		Arrays.sort(c1);
		System.out.println(Arrays.toString(c1));
		char[] c2 = s2.toCharArray();
		for (char c : c2) {
			if (Character.isUpperCase(c)) {
				c = Character.toLowerCase(c);
			}
		}
		Arrays.sort(c2);
		Arrays.toString(c2);
		System.out.println(Arrays.toString(c2));
		int count = 0;
		if (c1.length != c2.length) {
			System.out.println("string is not anagram");
		} else {
			for (int i = 0; i < c1.length; i++) {
				if (c1[i] == c2[i]) {
					count++;
				} else {
					break;
				}
			}
			if (count == c1.length)
				System.out.println("string is anagram");
			else
				System.out.println("not an anagram");
		}
	}
}
