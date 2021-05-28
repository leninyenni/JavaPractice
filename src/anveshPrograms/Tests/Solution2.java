package anveshPrograms.Tests;

import java.util.HashMap;

class Solution1 {
    public static int solution(int[] A) {
        HashMap<Integer,Integer> occurs = new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(occurs.containsKey(A[i]) && occurs.get(A[i]) == 1){
                occurs.remove(A[i]);
            }else{
                occurs.put(A[i],1);
            }
        }
        for(int key : occurs.keySet()){
            return key;
        }
        return 0;
    }
}

public class Solution2 {
    public static void main (String []args){
        Solution1 s1=new Solution1();
        int [] A = new int[]{8,7,9,8,7,9,8,7,9};
        System.out.println(s1.solution(A));

    }
}

