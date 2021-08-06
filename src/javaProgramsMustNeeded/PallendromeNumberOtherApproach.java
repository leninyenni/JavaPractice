package javaProgramsMustNeeded;

import java.util.Scanner;

public class PallendromeNumberOtherApproach {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner input = new Scanner(System.in);
        int num= input.nextInt();

        StringBuffer stringBuffer= new StringBuffer(String.valueOf(num));
        stringBuffer.reverse();

        if(stringBuffer.toString().equals(String.valueOf(num)))
        {
            System.out.println("its a pallendrome number");
        }
        else {
            System.out.println("its not a pallendrome number");
        }
    }
}
