package javaProgramsMustNeeded;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReplaceMulOccurencesWithDollarFromSecond {
    public static void main(String[] args) {
        String str = "abacdd";
        System.out.println(countOfOccurences(str));
        System.out.println(result(countOfOccurences(str)));
    }
    public static Map<Character, Integer> countOfOccurences(String str) {
        Map<Character, Integer> occurencesOfChar = new LinkedHashMap<Character, Integer>();
        char[] characters = str.toCharArray();
        for (char c : characters) {
            if (occurencesOfChar.containsKey(c)) {
                occurencesOfChar.put(c, occurencesOfChar.get(c) + 1);
            } else {
                occurencesOfChar.put(c, 1);
            }
        }
        return occurencesOfChar;
    }
    public static String result(Map<Character, Integer> testMap) {
        ArrayList<String> finalList = new ArrayList<>();
        boolean methodCalledFirstTime=false;
        for (char c : testMap.keySet()) {
            if (testMap.get(c) > 1) {
                methodCalledFirstTime=true;
                finalList.add("$");
            } else {
                finalList.add(Character.toString(c));
            }
        }
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < finalList.size(); i++) {
            sb.append(finalList.get(i));
        }
        String str = sb.toString();
        return str;
    }
}
