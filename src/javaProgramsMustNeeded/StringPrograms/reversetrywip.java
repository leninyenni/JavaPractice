package javaProgramsMustNeeded.StringPrograms;

public class reversetrywip {

    public static void main(String[] args) {
        String str= "lenin kumar";
        String temp="";
        for (int i =str.length()-1;i>=0;i--)
        {
          temp=temp+str.charAt(i);
        }
        System.out.println(temp);
    }
}
