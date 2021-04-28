package javaLearning.regularExpressoins;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifiers {
	public static void main(String[] args) {
	Pattern p = Pattern.compile("a*"); //we need to add one more backslash so that compiler will identify appropriate regex
		Matcher m = p.matcher("abaabaaaba");
		while (m.find()) {
			System.out.println(m.start()+"---"+ m.group()); //group() gives the match it searching for
		}
	}
}
