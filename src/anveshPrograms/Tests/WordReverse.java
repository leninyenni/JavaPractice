package anveshPrograms.Tests;

public class WordReverse {
    public static void main(String []args){
        String str="I AM A GEEK";
        String[] strarr=str.split(" ");
        for (int i=strarr.length-1;i>=0;i--)
            System.out.print(strarr[i]+" ");
    }
}
