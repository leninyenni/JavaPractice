package companies.intrvwQustns.WellsFargo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CheckWordIsHavingUniqueLetters {
    boolean uniqueCharacters(String str) {
        // If at any time we encounter 2 same
        // characters, return false
        for (int i = 0; i < str.length(); i++)
            for (int j = i + 1; j < str.length(); j++)
                if (str.charAt(i) == str.charAt(j))
                    return false;
        return true;
    }

    boolean uniqueCharactersWithSet(String str) {
        // If at any time we encounter 2 same
        // characters, return false
        for (int i = 0; i < str.length(); i++) {
            Set<Character> set = new HashSet<>();
            for (int j = i; j < str.length(); j++)
                if (!set.add(str.charAt(j))) {
                    return false;
                }
            // If no duplicate characters encountered,
            // return true
        }
        return true;
    }

    boolean uniqueCharactersCheckingUsingMap(String str) {
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> countOfChars = new HashMap<>();
        boolean isUnique = false;
        for (Character c : chars) {
            int count = 1;
            if (!countOfChars.containsKey(c)) {
                countOfChars.put(c, count);
            } else {
                countOfChars.put(c, countOfChars.get(c) + count);
                return false;
            }
        }
        return true;
    }


    public static void main(String args[]) {
        CheckWordIsHavingUniqueLetters obj = new CheckWordIsHavingUniqueLetters();
        String input = "godavri";
        if (obj.uniqueCharacters(input))
            System.out.println("The String " + input + " has all unique characters");
        else
            System.out.println("The String " + input + " has duplicate characters");
        if (obj.uniqueCharactersWithSet(input)) {
            System.out.println("unique");
        } else {
            System.out.println("duplicates");
        }
        if (obj.uniqueCharactersCheckingUsingMap(input)) {
            System.out.println("unique using map");
        } else {
            System.out.println("duplicate using map");
        }
    }
}
