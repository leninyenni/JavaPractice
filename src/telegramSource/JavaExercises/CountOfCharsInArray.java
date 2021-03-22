package telegramSource.JavaExercises;

import java.util.HashMap;

public class CountOfCharsInArray {
    public static void main(String[] args) {
        char[] chars ={'a','a','b','a','a','b','b','c'};
        HashMap<Character, Integer> countOfChars= new HashMap<>();


        for (Character c : chars)
        {
            int count=1;
            if(!countOfChars.containsKey(c))
            {
                countOfChars.put(c,count);
            }
            else
            {
                countOfChars.put(c,countOfChars.get(c)+count);
            }
        }
        System.out.println(countOfChars);
    }
}
