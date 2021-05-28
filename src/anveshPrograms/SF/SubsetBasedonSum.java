package anveshPrograms.SF;

import java.util.ArrayList;
import java.util.HashSet;

public class SubsetBasedonSum {
    public static  void main (String[] args){
        ArrayList<Integer> set1=new ArrayList<>();
        ArrayList<Integer> set2=new ArrayList<>();
        int sum=11;
        set1.add(5);
        set1.add(6);
        set1.add(4);
        set1.add(9);
        set1.add(8);

        set2.add(3);
        set2.add(7);
        set2.add(8);
        set2.add(4);
        set2.add(6);
        getSubsetFromSum(set1,set2,sum);
    }

    public static void getSubsetFromSum(ArrayList<Integer> set1, ArrayList <Integer> set2 , int sum){

        HashSet<Integer> resultSuBset= new HashSet<Integer>();


//    if()
        for(int i=0;i<set1.size();i++){
            for (int j=0;j<set2.size();j++){
                if(set1.get(i)+set2.get(j)==sum)
//                    resultSuBset.add(i);
//                    resultSuBset.add(j);
                    System.out.println(set1.get(i)+"  "+set2.get(j));

//                    break;

            }
        }



    }
}
