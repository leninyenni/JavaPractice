package companies.intrvwQustns.Oracle.RoundTwo;

import java.util.ArrayList;
import java.util.List;

public class SortStringsWithCustomMethodMyOwn {

    public static boolean compareTwoStrings(String string1, String str2)
    {
        if (string1.length()==str2.length())
        {
            for (int i =0;i<string1.length();i++)
            {
                if (string1.charAt(i)>str2.charAt(i))
                {
                    return false;

                }
                else if(string1.charAt(i)<str2.charAt(i))
                {
                    return true;
                }
                else
                {

                }
            }
        }
        else if (string1.length()<str2.length())
        {
            return true;
        }
        else {
            return false;
        }
    return true;
    }

    public static void main(String[] args) {
        List<String> stringList= new ArrayList<>();
        stringList.add("lenin");
        stringList.add("abc");
        stringList.add("lanin");
        stringList.add("defg");
        String[] stringArray =
                stringList.toArray(new String[stringList.size()]);
        //or you can pass str
        String str[] = { "lenin", "abc", "lanin", "defg"};
        String temp;
        System.out.println("Sorted strings...");

        ArrayList<String> list= new ArrayList<>();
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = i + 1; j < stringArray.length; j++) {
                if (compareTwoStrings(str[j],str[i])) {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
            //System.out.println(str[i]);
            list.add(str[i]);
        }
        System.out.println(list);
    }

}
