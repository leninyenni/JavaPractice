package interviewQuestions.telegramSource.InterviewPrograms;

import java.util.HashSet;
import java.util.Set;

public class MostRepeatedNumUsingSortLenin {
    public static void main(String[] args) {
        int arr[] = {3,4, 4, 3, 3,4};
        int element = 0;
        int count = 0;
        int max = 0;
        Set<Integer> al = new HashSet<Integer>();
        boolean repeat = false;
        for (int i = 0; i < arr.length; i++) {
            int tempElement = arr[i];
            int tempCount = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == tempElement) {
                    tempCount++;
                }
            }
            if (tempCount > count) {
                element = tempElement;
                count = tempCount;
                max = element;
                al= new HashSet<>();
            }
            if (tempCount==count)
            {
                al.add(tempElement);
            }
        }
        al.add(max);
       /* Iterator<Integer> itr = al.iterator();
        System.out.println("Traversing over Set using Iterator");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }*/
        System.out.println("Most repeating element/elements are : "+al);
    }
}
