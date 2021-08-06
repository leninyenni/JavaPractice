package companies.intrvwQustns.WellsFargo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NonRepeatedWordsInASentence {

    public static boolean isWordWithChar(String word) {
        List<Character> listOfChars = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            listOfChars.add(word.charAt(i));
        }
        Collections.sort(listOfChars);
        for (int i = 0; i < listOfChars.size(); i++) {
            if (i + 1 < listOfChars.size())
                if (listOfChars.get(i) - listOfChars.get(i + 1) == 0) {
                    return false;
                } else {
                    if (listOfChars.get(i) - listOfChars.get(i + 1) == 0) {
                        return false;
                    }
                }
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "This is Lenin from India who is a automation engineer gun mana";
        String[] words = input.split(" ");
        String finalSentence = "";
        for (String str : words) {
            if (isWordWithChar(str.toLowerCase())) {
                finalSentence = finalSentence + str + " ";
            }
        }
        System.out.println(finalSentence);

    }


}
