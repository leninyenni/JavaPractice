package javaProgramsMustNeeded;

public class BreakingInteger {

    public static int countOfDigits(int number)
    {
        return  String.valueOf(number).length();
    }

    public static int powerOfNumber(int exponent)
    {
        int number=10;
        for (int i =0;i<exponent-1;i++)
        {
            number=number*10;
        }
        return number;
    }
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        System.out.print("Enter a n-digit number: ");
//reading a number from the user
        int number=sc.nextInt();
        int countOfDigits= countOfDigits(number);

        int digit1=number/100000%10;
        int digit2=number/10000%10;
        int digit3=number/1000%10;
        int digit4=number/100%10;
        int digit5=number/10%10;
        int digit6=number%10;
//prints the digits
        System.out.println(digit1 + "," + digit2 + "," + digit3 + "," + digit4 + "," + digit5 + "," + digit6);*/
        System.out.println(powerOfNumber(6));
        int number=1234567;
        System.out.println(powerOfNumber(countOfDigits(number)-1));
        int count=countOfDigits(number)-1;
        while (count!=0)
        {
            int temp=powerOfNumber(count);
            int digit=number/temp%10;
            System.out.println(digit);

            if (count==1)
            {
                digit=number%10;
                System.out.println(digit);
            }
            count--;
        }
    }
}
