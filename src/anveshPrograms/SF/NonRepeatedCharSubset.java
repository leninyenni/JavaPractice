package anveshPrograms.SF;

import java.util.ArrayList;

public class NonRepeatedCharSubset {

    public static void main (String []a){
        String str="ababcbacadefegdijhkli";
        //System.out.println(str.substring(str.indexOf('a'),str.lastIndexOf('a')+1));

       System.out.println(getNonrepeatedsubString(str));
    }

    public static ArrayList<String> getNonrepeatedsubString(String str){
        int  lastIndex=0;
        ArrayList<String> al= new ArrayList<>();
//        int i=0;
//
//        for(int i=lastIndex;lastIndex<str.length();i++){
        while(lastIndex!=str.length()){

           al.add(str.substring(str.indexOf(str.charAt(lastIndex)),str.lastIndexOf(str.charAt(lastIndex))+1));
            lastIndex=str.lastIndexOf(str.charAt(lastIndex))+1;


        }
        return al;
    }
}
