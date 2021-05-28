package javaProgramsMustNeeded.StringPrograms;

import java.util.Arrays;
import java.util.Scanner;

/*reference link
http://www.topjavatutorial.com/java/java-programs/java-program-to-check-if-two-strings-are-anagrams/
 */
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String str1 = sc.nextLine();
        System.out.println("Enter second string");
        String str2 = sc.nextLine();
        System.out.println("Checking for anagram returned " + isAnagram(str1, str2));
    }

    public static boolean isAnagram(String str1, String str2) {
        String rmspacesstr1 = str1.replaceAll(" ", "");
        String rmspacesstr2 = str1.replaceAll(" ", "");
        char[] arraystr1 = rmspacesstr1.toCharArray();
        char[] arraystr2 = rmspacesstr1.toCharArray();
        Arrays.sort(arraystr1);
        System.out.println(Arrays.toString(arraystr1));
        Arrays.sort(arraystr2);
        System.out.println(Arrays.toString(arraystr2));
        return Arrays.equals(arraystr1, arraystr2);

    }
}
