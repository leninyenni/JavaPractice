package anveshPrograms.Tests;

import java.util.ArrayList;


public class FizzBizz {
    public ArrayList<String> fizzBuzz(int A) {
        ArrayList <String> al=new ArrayList<>();
        for(int i=1; i<=A;i++){
            if(i%3==0)
                al.add(i-1,"Fizz");
            else if(i%5==0)
                al.add(i-1,"Buzz");
            else
                al.add(i-1,Integer.toString(i));

        }
        return al;
    }
    public static void main(String args[]){
        FizzBizz f1=new FizzBizz();
        System.out.println(f1.fizzBuzz(10));
    }
}
