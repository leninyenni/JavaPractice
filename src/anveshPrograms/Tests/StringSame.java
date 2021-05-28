package anveshPrograms.Tests;

public class StringSame {
    public String sameString(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return "Not Same";
        }
        int value = 0;
        for (int i = 0; i < s1.length(); i++) {
            value = value ^ (int) s1.charAt(i);
            value = value ^ (int) s2.charAt(i);
        }
        if (value == 0)
            return "YES";
        return "NO";
    }
    public static void main(String args[]){
        String str1="abcd";
        String str2="abc";
        StringSame s=new StringSame();
        System.out.println(s.sameString(str1,str2));
    }
}
