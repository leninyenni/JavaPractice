package anveshPrograms.Tests;

import java.util.ArrayList;

public class Maximizer {
    public int solve(ArrayList<ArrayList<Integer>> A) {
        int n = A.size();
        int m = A.get(0).size();
        int ans = 0;
        int[][] dp = new int[n][m];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (A.get(i).get(j) != 0) {
                    if ((i + 1) < n && (j + 1) < m)
                        dp[i][j] = 1 + Math.min(dp[i + 1][j], Math.min(dp[i + 1][j + 1], dp[i][j + 1]));
                    else
                        dp[i][j] = A.get(i).get(j);
                }
                if (ans < dp[i][j]) {
                    ans = dp[i][j];
                }
            }
        }
        return ans;
    }
    public static void main(String [] args){
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        ArrayList<Integer> al3=new ArrayList<>();
        ArrayList<Integer> al4=new ArrayList<>();
        ArrayList<Integer> al5=new ArrayList<>();


        al1.add(1);
        al1.add(0);
        al1.add(1);
        al1.add(0);

        al2.add(1);
        al2.add(1);
        al2.add(1);
        al2.add(1);

        al3.add(1);
        al3.add(1);
        al3.add(1);
        al3.add(1);

        al5.add(1);
        al5.add(1);
        al5.add(1);
        al5.add(1);

        al4.add(1);
        al4.add(0);
        al4.add(1);
        al4.add(0);

        al.add(al1);
        al.add(al2);
        al.add(al3);
        al.add(al5);
        al.add(al4);
        Maximizer s=new Maximizer();
       System.out.print( s.solve(al));

    }
}