package javaLearning.stringManipulations;

public class RemoveCharacter {

    private static String removeChar(String str, char c) {
        if (str == null)
            return null;
        //here replaceAll accepts string, hence we need to convert passed character to a string using like below
        return str.replaceAll(Character.toString(c), "");
    }
    public static void main(String[] args) {
        String str = "Lenin";
        System.out.println(removeChar(str, 'e'));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
    }
}
