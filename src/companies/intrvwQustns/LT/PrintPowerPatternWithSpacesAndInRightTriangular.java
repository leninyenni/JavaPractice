package companies.intrvwQustns.LT;

import java.util.Scanner;

public class PrintPowerPatternWithSpacesAndInRightTriangular {

    public static int powerOfNumber(int power, int number)
    {
        int result=number;
        for (int i=1;i<=power;i++)
        {
            if(i==1)
            {
                result=number;
            }
            else
            {
                result=result*number;
            }
        }
        return result;
    }

    public static void patternPrint(String str)
    {
        for (int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /*System.out.println(powerOfNumber(3));*/
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your number : ");
        int number=input.nextInt();
        System.out.println("Enter the range you want : ");
        int range=input.nextInt();


        for (int i =1; i<=range;i++)
        {
            patternPrint(String.valueOf(powerOfNumber(i,number)));

        }
    }
}
