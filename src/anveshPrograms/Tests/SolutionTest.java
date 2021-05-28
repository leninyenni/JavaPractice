package anveshPrograms.Tests;

class Solution {
    public static int solution(int[] A) {
        int n = A.length;
        int result = 0;
        for (int i = 0; i < n - 1; ) {
            if (A[i] == A[i + 1])
                result = result + 1;
            i = i + 1;
        }
        if (result == n - 1) return result - 1; // to cover {1,1}, {1,1,1}
        int max = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            if (i > 0) // starting up from 1 and covering the last
            {
                if (A[i - 1] != A[i])
                    count = count + 1;
                else
                    count = count - 1;
            }
            if (i < n - 1) {
                if (A[i] != A[i + 1]) // starting with 0
                    count = count + 1;
                else
                    count = count - 1;
            }
            max = Math.max(max, count);
        }
        return result + max; //
    }
}


public class SolutionTest {
    public static void main(String Args[]){
        //Prime sl=new Prime();
       // int []B=new int[]{1,1,1};
       // System.out.println(sl.solution(B));
    }
}
