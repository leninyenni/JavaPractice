package javaLearning.arrays;

public class Point1 {
	// Its possible to declare array return type methods
	
	int[] m1()
	{
		System.out.println("this is m1 method");
		int[] a= {10,20,30};
		return a;
	}
	void m2(double[] d)
	{
		System.out.println("this is m2 method");
		for ( double dd : d)
		{
			System.out.println(dd);
		}
	}
	public static void main(String[] args) {
		Point1 p= new Point1();
		int[] xx=p.m1(); // m1 returns integer type array
		for (int out : xx)
		{
			System.out.println(out);
		}
	
		double[] xyz= {10.5,10.2,10.5};
		p.m2(xyz);
	}

}
