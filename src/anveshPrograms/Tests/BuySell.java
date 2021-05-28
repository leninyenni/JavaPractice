package anveshPrograms.Tests;

import java.io.*;
import java.util.*;
public final class BuySell
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static FastScanner sc=new FastScanner(br);
    static PrintWriter out=new PrintWriter(System.out);
    static int[] bit;
    static int maxn=(int)(1e5)+3;

    static void update(int idx,int val)
    {
        while(idx<maxn)
        {
            bit[idx]+=val;
            idx+=idx&-idx;
        }
    }

    static int query(int idx)
    {
        int sum=0;
        while(idx>0)
        {
            sum=sum+bit[idx];
            idx-=idx&-idx;
        }
        return sum;
    }

    public static void main(String args[]) throws Exception
    {
        int n=sc.nextInt();Pair[] a=new Pair[n];
        for(int i=0;i<n;i++)
        {
            a[i]=new Pair(sc.next(),sc.nextInt());
        }
        Arrays.sort(a);
        int q=sc.nextInt();
        bit=new int[maxn];
        int[] cnt=new int[n];
        while(q>0)
        {
            char op=sc.next().charAt(0);
            if(op=='+')
            {
                String curr=sc.next();int pos=Arrays.binarySearch(a,new Pair(curr,-1));cnt[pos]++;update(a[pos].val,1);
            }
            else if(op=='-')
            {
                String curr=sc.next();int pos=Arrays.binarySearch(a,new Pair(curr,-1));
                if(cnt[pos]>0)
                {
                    cnt[pos]--;update(a[pos].val,-1);
                }
            }
            else
            {
                int y=sc.nextInt();out.println(query(maxn-1)-query(y));
            }
            q--;
        }
        out.close();
    }
}
class Pair implements Comparable<Pair>
{
    String name;int val;
    public Pair(String name,int val)
    {
        this.name=name;
        this.val=val;
    }
    public int compareTo(Pair x)
    {
        return this.name.compareTo(x.name);
    }
}
class FastScanner
{
    BufferedReader in;
    StringTokenizer st;
    public FastScanner(BufferedReader in) {
        this.in = in;
    }

    public String nextToken() throws Exception {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(in.readLine());
        }
        return st.nextToken();
    }

    public String next() throws Exception {
        return nextToken().toString();
    }

    public int nextInt() throws Exception {
        return Integer.parseInt(nextToken());
    }
    public long nextLong() throws Exception {
        return Long.parseLong(nextToken());
    }
    public double nextDouble() throws Exception {
        return Double.parseDouble(nextToken());
    }
}