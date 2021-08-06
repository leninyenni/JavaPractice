package interviewQuestions.telegramSource.JavaExercises;

import java.util.Arrays;

public class LargestIntegerKHavingOpposite {
    public static void main(String[] args) {
        int[] array= {1,-1,2,-2,9,9,-9,10,-10};
        Arrays.sort(array);
        boolean itsMaximum=false;
        outerloop:
        for (int i=array.length-1;i>=0;i--)
        {
            for (int j=array.length-1;j>=0;j--)
            {
                if (array[i]+array[j]==0)
                {
                    System.out.println(array[i]);
                    break outerloop;
                }
            }
        }
    }
}
