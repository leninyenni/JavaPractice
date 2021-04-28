package interviewQuestions.telegramSource.JavaExercises;

import java.util.Arrays;
import java.util.TreeSet;

public class ExtractSameCharFromTwoSentences {
	public static void main(String[] args) {
		String sent1 = "uma de vi";
		String sent2 = "k um ar";
		//char[] arraysent1 = sent1.replace(" ","").toCharArray();
		char[] arraysent1 = sent1.replaceAll("\\s+","").toCharArray();
		System.out.println(Arrays.toString(arraysent1));
		
		char[] arraysent2= sent2.replaceAll("\\s+","").toCharArray();
		
		TreeSet<Character> setsent1=new TreeSet<Character>();
		TreeSet<Character> setsent2=new TreeSet<Character>();
				
		for(char c:arraysent1)
			setsent1.add(c);
		for (Character character : arraysent2) {
			setsent2.add(character);
		}
		//print the sets
		System.out.println(setsent1);
		System.out.println(setsent2);
		
		//retaining all elements in a set from that of given/passed collection 
		setsent1.retainAll(setsent2);
		System.out.println(setsent1);
	}
}
