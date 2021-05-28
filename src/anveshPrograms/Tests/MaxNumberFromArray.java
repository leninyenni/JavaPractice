package anveshPrograms.Tests;

import java.util.*;

public class MaxNumberFromArray {
    // DO NOT MODIFY THE LIST
    public String largestNumber( List<Integer> a) {

        String[] arr = new String[a.size()];
        for (int i = 0; i < a.size(); i++) {
            arr[i] = String.valueOf(a.get(i));
        }


        Arrays.sort(arr, new Comparator<String>(){
            public int compare(String a, String b){
                return (b+a).compareTo(a+b);
            }
        });


        StringBuilder sb = new StringBuilder();
        for(String s: arr){
            sb.append(s);
        }

        if(sb.charAt(0) == '0'){     //check if all zeroes are there
            return String.valueOf(0);
        }

        return sb.toString();
    }

    public static  void main (String []args){
        ArrayList <Integer> al=new ArrayList<>();
        al.add(26);
        al.add(1056);
        al.add(7);
        MaxNumberFromArray max= new MaxNumberFromArray();
        System.out.println(max.largestNumber(al));
    }
}
