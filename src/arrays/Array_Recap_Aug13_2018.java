package arrays;

public class Array_Recap_Aug13_2018 {
	
	static int add=0;
	
	public static int  sum (int[] a)
	{
		for (int i=0;i<a.length;i++)
		{
		 add= add+a[i];
		}
		
		return add;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(sum (new int[] {10,20,30,100,20,100}));
	}
}
