package interviewQuestions.InterviewPrograms;

/*
input is  le@n#in
output is ni@n#el
*/


import java.util.ArrayList;
import java.util.List;

public class ReverseWithOutChangingCharacters {

    public static String reverseStrSpecial(String str) {
        int len = str.length();
        char[] revStrArr = new char[len];
        int j = len - 1;
        for (int i = 0; i <= j; ) {
            if (!Character.isAlphabetic(str.charAt(i))) {
                revStrArr[i] = str.charAt(i);
                i++;
            } else if (!Character.isAlphabetic(str.charAt(j))) {
                revStrArr[j] = str.charAt(j);
                j--;
            } else {
                revStrArr[j] = str.charAt(i);
                revStrArr[i] = str.charAt(j);
                j--;
                i++;
            }
        }
        return new String(revStrArr);
    }

    public static String stringReverseMyMethod(String str, List<Integer> listofIndeces) {
        String withOutChars = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            if (Character.isAlphabetic(str.charAt(i))) {
                withOutChars = withOutChars + str.charAt(i);
            }
        }
        //  System.out.println(withOutChars);
        String output = "";
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!listofIndeces.contains(i)) {
                output = output + withOutChars.charAt(index);
                index++;
            } else {
                output = output + str.charAt(i);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        String input = "l e  n   i    n";
        char[] chars = input.toCharArray();
        List<Integer> listOfIndices = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (!Character.isAlphabetic(chars[i])) {
                listOfIndices.add(i);
            }
        }
        String input2 = "l@e##n#$ i!@ n";
        char[] chars2 = input2.toCharArray();
        List<Integer> listOfIndices2 = new ArrayList<>();
        for (int i = 0; i < chars2.length; i++) {
            if (!Character.isAlphabetic(chars2[i])) {
                listOfIndices2.add(i);
            }
        }
        System.out.println("This is using internet search method :");
        System.out.println(reverseStrSpecial(input));
        System.out.println("This is using my method :");
        System.out.println(stringReverseMyMethod(input, listOfIndices));
        System.out.println("This is using internet search method :");
        System.out.println(reverseStrSpecial(input2));
        System.out.println("This is using my method :");
        System.out.println(stringReverseMyMethod(input2, listOfIndices2));
    }
}
