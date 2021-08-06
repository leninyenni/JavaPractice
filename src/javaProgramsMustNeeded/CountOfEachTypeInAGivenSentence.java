package javaProgramsMustNeeded;

import java.util.Scanner;

public class CountOfEachTypeInAGivenSentence {
    public static void main(String[] args) {
        //variable declaration
        String str;
        int Alphabets = 0, num = 0, space = 0, Special = 0;
//vriable declaration and initialization
        Scanner scan = new Scanner(System.in);
        //create a scanner object for input
        System.out.println("Enter the String  ");
        str = scan.nextLine();
        int i = 0;
        while (i < str.length()) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') { //Check Alphabets
                Alphabets++;
            } else if (ch >= '0' && ch <= '9') { //Check numeric charaters
                num++;
            } else if (ch == ' ') {
                space++; //Check Space
            } else {
                Special++; //Find special characters
            }
            i++;
        }
        System.out.println("\nAlphabet letters: " + Alphabets);
        System.out.println("Number: " + num);
        System.out.println("Space: " + space);
        System.out.println("Special characters: " + Special);
    }
}
