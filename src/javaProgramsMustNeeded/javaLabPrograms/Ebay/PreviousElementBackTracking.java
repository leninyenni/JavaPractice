package javaProgramsMustNeeded.javaLabPrograms.Ebay;

import java.io.IOException;

public class PreviousElementBackTracking {

    public static void main(String[] args) throws IOException {
        String s = "abc**";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*' && sb.length() != 0) {
                sb.deleteCharAt(sb.length() - 1);
            } else if (s.charAt(i) != '*') {
                sb.append(s.charAt(i));
            } else {
                sb = new StringBuilder("invalid string");
                break;
            }
        }
        System.out.println(sb.toString());
    }
}
