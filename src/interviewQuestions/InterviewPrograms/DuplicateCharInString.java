package interviewQuestions.InterviewPrograms;

import java.util.LinkedHashSet;

public class DuplicateCharInString {
    /* Function removes duplicate characters from the string
      This function work in-place */

    String removeDuplicates(String str) {
        String finstring="";
        //here we have taken Linked hashset to preserve insertion order and not to allow duplicates
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++)
            lhs.add(str.charAt(i));
        // print string after deleting duplicate elements
        for (Character ch : lhs)
            finstring=finstring+ch;
        return finstring;
    }

    /* Driver program to test removeDuplicates */
    public static void main(String args[]) {
        String str = "ramab";
        DuplicateCharInString r = new DuplicateCharInString();
        System.out.println(r.removeDuplicates(str));
    }


}
