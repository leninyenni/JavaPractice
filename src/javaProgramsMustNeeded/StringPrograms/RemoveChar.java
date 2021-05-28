package javaProgramsMustNeeded.StringPrograms;

public class RemoveChar {

    public static String removeChar(String str, char c)
    {
        if (str==null)
        {
            System.out.println("Enter some value");
        }
        else {
            //The important point to note is that it accepts String as argument,
            // so we will use Character class to create String and use it to replace all the characters with empty String.
            return str.replaceAll(Character.toString(c), "");
        }
         return null;
    }

    public static void main(String[] args) {
        System.out.println(removeChar("lenin",'n'));

        String str= "govind";
        String newstring =str.replaceAll("g", "a");
        System.out.println(newstring);
    }
}
