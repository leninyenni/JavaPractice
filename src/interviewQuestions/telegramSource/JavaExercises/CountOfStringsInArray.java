package interviewQuestions.telegramSource.JavaExercises;

import java.util.*;

public class CountOfStringsInArray {
    public static void main(String[] args) {
        String[] strings = {"note", "note", "java", "java","note","note"};
        HashMap<String, Integer> countOfStrings = new HashMap<>();
        String[] stringResultantArray = new String[6];
        for (int i = 0; i < strings.length; i++) {
            int count = 1;
            int appendcount=0;
            if (!countOfStrings.containsKey(strings[i])) {
                countOfStrings.put(strings[i], count);
                String current = strings[i] + " " + appendcount;
                stringResultantArray[i] = current;
            } else {
                countOfStrings.put(strings[i], countOfStrings.get(strings[i]) + count);
                int c = countOfStrings.get(strings[i]) + appendcount;
                String current = strings[i] + " " + c;
                stringResultantArray[i-1] = current;
            }
        }
        System.out.println(countOfStrings);
        for (String str : stringResultantArray) {
            System.out.println(str);
        }

        List<String> list= Arrays.asList(stringResultantArray);
        System.out.println(list);
        //tried to remove nulls with below approach but somehow couldn't
        list.removeAll(Collections.singletonList(null));

        System.out.println(list);

        //null insertion is not possible in tree set and if you try to add nulls it will give you nullpointer exception
        /*Set<String> set= new TreeSet<String>(list);
        System.out.println(set);
*/
    }
}
