//import java.util.ArrayList;
//
//class PrimeSum
//{
//
//    static boolean findPrime(int n, boolean isPrime[])
//    {
//        isPrime[0] = isPrime[1] = false;
//        for (int i = 2; i <= n; i++)
//            isPrime[i] = true;
//
//        for (int p = 2; p * p <= n; p++)
//        {
//            if (isPrime[p] == true)
//            {
//                for (int i = p * p; i <= n; i += p)
//                    isPrime[i] = false;
//            }
//        }
//        return false;
//    }
//
//    // Prints a prime pair with given sum
//    static void findPrimePair(int n)
//    {
//        // Generating primes using Sieve
//        boolean isPrime[]=new boolean[n + 1];
//        findPrime(n, isPrime);
//        ArrayList<Integer> al=new ArrayList<>();
//
//        for (int i = 0; i < n; i++)
//        {
//            if (isPrime[i] && isPrime[n - i])
//            {
//               // System.out.print(i + " " + (n - i));
//                al.add(i);
//                al.add(n-i);
//                //return al;
//            }
//        }
//
//        return al;
//    }
//
//    // Driver code
//    public static void main (String[] args)
//    {
//        int n = 74;
//        findPrimePair(n);
//    }
//}