package javaLearning.stringManipulations;

public class PermutationsOfAStringEasyWay {
    public static void main(String[] args) {
        String input = "ABC";
        int lengthOfString = input.length();
        calculatePermutations(input,0,lengthOfString-1);
    }

    public static void calculatePermutations(String inputString, int left, int right) {
        if (left == right) {
            System.out.println(inputString);
        } else {
            for (int i = left; i <= right; i++) {
                String swapped = swapElements(inputString, left, i);
                calculatePermutations(swapped, left + 1, right);
            }
        }

    }


    public static String swapElements(String givenString, int i, int j) {
        char temp;
        char[] charArrayFromString = givenString.toCharArray();
        temp = charArrayFromString[i];
        charArrayFromString[i] = charArrayFromString[j];
        charArrayFromString[j] = temp;
        return String.valueOf(charArrayFromString);

    }
}
