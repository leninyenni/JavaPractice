package companies.intrvwQustns.Oracle.RoundTwo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CountOfEachCharacterFromValuesMap {

    public static HashMap<Character,Integer> countOfCharsInStringMap = new HashMap<>();

    public static void countOfCharsInString(String str)
    {
        for (int i=0;i<str.length();i++)
        {
            if(countOfCharsInStringMap.containsKey(str.charAt(i)))
            {

                countOfCharsInStringMap.put(str.charAt(i),countOfCharsInStringMap.get(str.charAt(i))+1);
            }
            else
            {
                countOfCharsInStringMap.put(str.charAt(i),1);
            }
        }
    }

    public static void main(String[] args) {
        Map<Integer,String> map= new HashMap<>();
        map.put(1,"sachin");
        map.put(2,"rahulu");
        map.put(3,"saurav");
        map.put(4,"virat");
        Collection<String> collection= map.values();
      for (String s:collection)
      {
          countOfCharsInString(s);
      }
        System.out.println(countOfCharsInStringMap);

    }
}
