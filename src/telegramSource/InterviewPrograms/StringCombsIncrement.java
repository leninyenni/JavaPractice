package telegramSource.InterviewPrograms;

import java.util.Scanner;

public class StringCombsIncrement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("provide your input string :");
        String teststring = input.next();
        int b = 0;
        //a,b,c,d,ab,bc,cd,abc,bcd,abcd
        for (int totalloops = 1; totalloops <= teststring.length(); totalloops++) {
            int a = 0;
            b = totalloops;
            callme(a, b, teststring);
        }

    }

    private static void callme(int x, int y, String str) {
        while (y <= str.length()) {
            System.out.println(str.substring(x, y));
            x++;
            y++;
        }
    }
}


