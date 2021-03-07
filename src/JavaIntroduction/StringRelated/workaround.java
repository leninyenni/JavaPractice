package JavaIntroduction.StringRelated;

public class workaround {
    public static void main(String[] args) {

        //it is called string literal which gets created in String Constant Pool memory
        //here str1 and str2 points to same object "lenin"
        String str1="lenin";
        String str2= "lenin";
        str1=str1.concat("kumar");


        //it is called string object which gets created in normal heap memory
        String str3 = new String("lenin");


        String a = "ABC";
        String b = new String("ABC");
        String c = "ABC";
        System.out.println(a == b);  // false
        System.out.println(a == c); // true
        System.out.println(a.equals(b)); // true
        System.out.println(a.equals(c)); // true
    }
}
