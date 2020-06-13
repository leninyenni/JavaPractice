package arrays;

public class First {

	public static void main(String[] args) {
		int [] a= {10,20,30,40};
		
		//first approach to print
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		
		//second approach to print
	/*	for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}*/
		// third approach to print
		
	/*	for(int aa:a) // for each loop.right side of colon is variable
		{
			System.out.println(aa);
		}*/
		
		//when you declare array of user type then it takes default value as Null
		Some[] a1= new Some[3]; //list of objects created with reference type Some
		
		for (Some som: a1) 
		{
			System.out.println(som);
		}
		
		boolean [] b= new boolean[5]; //creating boolean array of size/length 5
		
		for (boolean b1: b)
		{
			System.out.println(b1);
		}
	}

}
