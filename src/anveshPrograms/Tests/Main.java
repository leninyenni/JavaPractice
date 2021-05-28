package anveshPrograms.Tests;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sampleInput;
        sampleInput = sc.next();
        printPermutn(sampleInput, "");
    }

    static void printPermutn(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char [] ch = str.toCharArray();

            String ros = str.substring(0, i) +
                    str.substring(i + 1);
            printPermutn(ros, ans + ch);
        }
    }
}