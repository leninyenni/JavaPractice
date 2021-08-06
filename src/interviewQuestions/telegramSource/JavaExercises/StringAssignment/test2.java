package interviewQuestions.telegramSource.JavaExercises.StringAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class test2 implements StringSplitter {

    @Override
    public List<String> split(String split, Set<Separator> seperators) {
        // TODO Auto-generated method stub
        List<String> li = new ArrayList<String>();
        int count = 0;
        for (Separator s : seperators) {
            split = split.replaceAll(String.valueOf(s.get()), " ");
            count = count + 1;
        }
        System.out.println(split);
        split = split.replaceAll(" ", ":");
        System.out.println(split);
        String[] arr = split.split(":");
        for (String r : arr) {
            if (!r.equals(""))
                li.add(r);
        }
        return li;
    }

}
