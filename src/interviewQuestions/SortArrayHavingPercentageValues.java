package interviewQuestions;

import java.util.Set;
import java.util.TreeSet;

public class SortArrayHavingPercentageValues {

    public static void main(String[] args) {
        Set<String> percentageValues= new TreeSet<>();
        percentageValues.add("10%");
        percentageValues.add("80%");
        percentageValues.add("50%");
        percentageValues.add("15%");
        percentageValues.add("30%");
        System.out.println(percentageValues);
    }
}
