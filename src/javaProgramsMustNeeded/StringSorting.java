package javaProgramsMustNeeded;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSorting {

    public static void main(String[] args) {
        List<String> strings= new ArrayList<>();
        strings.add("abb");
        strings.add("bbb");
        strings.add("aaa");
        strings.add("aab");
        System.out.println(strings);
        Collections.sort(strings);
        System.out.println(strings);

        Collections.sort(strings,new StringComparatorDesc());
        System.out.println(strings);

    }
}
