package companies.intrvwQustns.OpenText;

import java.util.ArrayList;

public class NumberOfSubStringsWorkaround {

    public static void subStringProvider(String a) {
        // Stores all occurences
        ArrayList<String> a1 = new ArrayList<>();
        // Generate all the substrings
        for (int i = 0; i < a.length(); i++) {
            for (int j = i + 1; j <= a.length(); j++) {
                // Avoid multiple occurences
                if (i != j)
                    // Append all substrings
                    a1.add(a.substring(i, j));
            }
        }
        System.out.println(a1);

    }

    public static void main(String[] args) {
        subStringProvider("lenin");
    }
}

