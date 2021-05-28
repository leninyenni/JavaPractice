package anveshPrograms.Tests;

import java.util.Arrays;

public class RotateArray {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int [] shiftedArray=new int [A.length];
        for(int i=0;K>i;K--){
            int p=0;
            for(int j=0;j<A.length;j++){
                if(j==0){
                    shiftedArray[p]=A[A.length-1];
                    p++;
                }else{
                    shiftedArray[p]=A[j-1];
                    p++;
                }

            }
            A = shiftedArray.clone();
        }
        return   shiftedArray;
    }

    public static void main(String args[]){
        RotateArray a1=new RotateArray();
        int []b=new int[]{3,4,9,7};
        System.out.println(Arrays.toString(a1.solution(b,4)));
    }
    public  void Abc(){
        System.out.println("Hi");
    }
}

