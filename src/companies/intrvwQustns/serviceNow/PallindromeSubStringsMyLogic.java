package companies.intrvwQustns.serviceNow;

import java.util.*;

public class PallindromeSubStringsMyLogic {

    public static HashSet<String> withOutDups = new LinkedHashSet<>();
    public static List<String> withDups = new ArrayList<>();

    public static void iterateEachString(String str) {
        for (int i = 0; i <= str.length(); i++) {
            if (str.substring(0, i).length() > 1 && pallindromeCheck(str.substring(0, i))) {
                System.out.println(str.substring(0, i));
                withOutDups.add(str.substring(0, i));
                withDups.add(str.substring(0,i));
            }
        }
    }

    public static void getSubStrings(String str) {
        int length = str.length();
        for (int i = 0; i <= str.length(); i++) {
            String temp = str.substring(i, length);
            iterateEachString(temp);
        }
    }

    public static boolean pallindromeCheck(String input) {
        StringBuffer stringBuffer = new StringBuffer(input);
        stringBuffer = stringBuffer.reverse();
        if (input.equals(stringBuffer.toString())) {
            return true;
        } else {
            return false;
        }

    }

    public static Map<String, Integer> getInMap(List<String> list)
    {
        Map<String, Integer> listToMap= new HashMap<>();

        for (String s: list)
        {
                if(listToMap.containsKey(s))
                {
                    listToMap.put(s,listToMap.get(s)+1);
                }
                else
                {
                    listToMap.put(s,1);
                }
        }
        return listToMap;
    }

    public static void main(String[] args) {
        getSubStrings("zyzyzyz");
        System.out.println(withOutDups);
        System.out.println(withDups);
        System.out.println(getInMap(withDups));

    }
}
