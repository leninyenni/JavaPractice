package anveshPrograms.Tests;// JAVA implementation of left rotation
// of an array K number of times 

import java.lang.*;

public class LefTArrayRotation
{
    // Function to leftRotate array multiple
    // times
    static void leftRotate(int arr[], int arraySize, int postion)
    {
        /* To get the starting point of
        rotated array */
        int mod = postion % arraySize;
        // Prints the rotated array from
        // start position
        for(int i = 0; i < arraySize; ++i)
            System.out.print(arr[(i + mod) % arraySize] + " ");
        System.out.println();
    }
    static void rightRotate(int arr[], int n, int k)
    {
        /* To get the starting point of
        rotated array */

        int mod = n-k;
//        int mod1 = n % k;
        // Prints the rotated array from
        // start position
        for(int i = 0; i < n; ++i){
//            mod=i+1;
         //System.out.println();
    }}
    public static void main (String[] args)
    {
        //int arr[] = { 1, 3, 5, 7, 9 };
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int k = 2;
//        leftRotate(arr, n, k);
       leftRotate(arr, n, k);
//        k = 3;
//        leftRotate(arr, n, k);
//        k = 4;
//        leftRotate(arr, n, k);

    }
} 