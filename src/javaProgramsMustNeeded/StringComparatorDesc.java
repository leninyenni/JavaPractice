package javaProgramsMustNeeded;

import java.util.Comparator;

public class StringComparatorDesc implements Comparator<String>{


    @Override
    public int compare(String str1, String str2) {
     return -str1.compareTo(str2);
    }
}
