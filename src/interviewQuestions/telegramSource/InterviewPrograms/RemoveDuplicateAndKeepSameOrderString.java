package interviewQuestions.telegramSource.InterviewPrograms;

import java.util.Arrays;

public class RemoveDuplicateAndKeepSameOrderString {

    public static String optimizedstring(char[] c, int n) {
        String tmp = "";
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
        for (int i = 0; i < c.length; i++) {
            if (i == c.length - 1) {
                tmp = tmp + c[i];
            }
            if (i < c.length - 1 && c[i] != c[i + 1]) {
                tmp = tmp + c[i];
            }
        }
        return tmp;
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'd', 'd', 'd', 'e', 'f', 'e'};
        System.out.println(optimizedstring(chars, chars.length));
    }


}
