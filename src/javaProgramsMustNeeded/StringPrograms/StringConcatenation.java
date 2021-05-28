package javaProgramsMustNeeded.StringPrograms;

public class StringConcatenation {
    public static void main(String[] args) {
        // This program shows multiple ways of concatenating string in java
        String str1 = "Hello";
        String str2 = "World";
        //Method 1 : Using + operator
        System.out.println("Using + operator");

        String str3 = str1 + " " + str2;
        System.out.println(str3);
        //Method 2 : Using concat() method
        System.out.println("Using concat() method");
        String str4 = str1.concat(" ").concat(str2);
        System.out.println(str4);
        //Method 3 : Using StringBuffer or StringBuilder
        System.out.println("Using append() method from StringBuilder class");
        StringBuilder builder = new StringBuilder();
        builder.append(str1).append(" ").append(str2);
        System.out.println(builder.toString());
        System.out.println("Using join() method added from 1.8");
        //Method 4 : Using join() method added in JDK 8
        String joinedString = String.join(" ", str1, str2);
        System.out.println(joinedString);
    }
}
