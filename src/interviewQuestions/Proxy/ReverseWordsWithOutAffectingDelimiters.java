package interviewQuestions.Proxy;

import java.util.Stack;

public class ReverseWordsWithOutAffectingDelimiters {
    static String reverseEachWordOfString(String inputString) {
        StringBuffer reversedString = new StringBuffer();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < inputString.length(); i++) {
            // Get each character
            char character = inputString.charAt(i);
            if (isDelimiter(character)) {             // If character is delimiter
                popInto(stack, reversedString);      // Then pop stack into output string
                reversedString.append(character);    // And append the delimiter
            } else
                stack.push(character);               // Else push character onto the stack
        }
        popInto(stack, reversedString);// In the end pop stack into output string
        StringBuffer str = new StringBuffer(reversedString.toString());
        return str.reverse().toString();
    }

    private static void popInto(Stack<Character> stack, StringBuffer str) {
        while (!stack.empty()) {
            str.append(stack.pop());
        }
    }

    private static boolean isDelimiter(char character) {
        return character == ' ' || character == '.' || character == ',' || character == '!';
    }

    public static void main(String[] args) {
        System.out.println(reverseEachWordOfString("hello \t lenin \t kumar"));
    }
}
