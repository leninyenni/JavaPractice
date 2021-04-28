package javaLearning.arrays;
public class Array_Reversing {
	public static void main(String[] args) {
		int arr[] = { 1, 4, 2, 45, 25, 45 };
		
		for(int x: arr)
		{
		System.out.println(x);
		}
		
		int rev[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			rev[i]= arr[arr.length-1-i];
		}
		System.out.println("Elements after reversing:");
		for (int y:rev)
		{
			System.out.println(y);
		}
		
	}
}
