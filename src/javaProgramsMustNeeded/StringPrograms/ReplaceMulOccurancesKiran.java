package javaProgramsMustNeeded.StringPrograms;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ReplaceMulOccurancesKiran {
    public static String m1(String input) {
        String output = "";
        Character firstOccurenceLetter = null;
        boolean isFirstOccuerenceCompleted = false;
        List<Character> removeCharacters = new ArrayList<>();
        for(int i=0; i<input.length(); i++) {
            for(int j=0; j<input.length(); j++) {
                if(i != j) {
                    if(input.charAt(i) == input.charAt(j) && (firstOccurenceLetter == null || firstOccurenceLetter != input.charAt(i))) {
                        if(!isFirstOccuerenceCompleted) {
                            isFirstOccuerenceCompleted = true;
                            firstOccurenceLetter = input.charAt(i);
                            output = output + input.charAt(i);
                            break;
                        }
                        else if(input.charAt(i) != firstOccurenceLetter) {
                            if(!removeCharacters.contains(input.charAt(i))) {
                                output = output + "*";
                                removeCharacters.add(input.charAt(i));
                            }
                        }
                    }
                    else if(StringUtils.countMatches(input, input.charAt(i)) == 1 || (firstOccurenceLetter != null && firstOccurenceLetter == input.charAt(i))) {
                        output = output + input.charAt(i);
                        break;
                    }
                }
            }
        }
        return output;
    }
    public static void main(String[] args) {
       /* System.out.println(m1("abbcdc"));
        System.out.println(m1("abcab"));*/
        System.out.println(m1("nana"));
        //System.out.println(m1("abbccde"));
    }
}
