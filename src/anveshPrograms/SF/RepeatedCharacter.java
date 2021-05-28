package anveshPrograms.SF;

import java.util.LinkedHashMap;
import java.util.Map;

public class RepeatedCharacter {
    public static void main(String[] args) {
        System.out.print(repatedCharCount("jaavvvaaaa"));

    }

    public static String repatedCharCount(String str) {
        String str1 = "";

        Map<Character, Integer> hmp = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!hmp.containsKey(str.charAt(i))) {
                hmp.put(str.charAt(i), 1);
            } else {
                int existingValue = hmp.get(str.charAt(i));
                hmp.put(str.charAt(i), existingValue+1);
            }
        }

        for (Character c : hmp.keySet()) {
            str1 = str1 + c + hmp.get(c);
        }
        //System.out.println(hmp.toString().replaceAll("\\{","").replaceAll(",","").replaceAll("}","").replaceAll("=",""));
        return str1;
    }
}
