package javaLearning.forLoop;

import java.util.ArrayList;
import java.util.List;

public class whileloop {

    public static void main(String[] args) {
        List<String> names= new ArrayList<>();
        names.add("lenin");
        System.out.println(names.isEmpty());
        names.remove("lenin");
        System.out.println(names.isEmpty());
        while (!names.isEmpty())
        {
            System.out.println("come here");
        }
    }
}
