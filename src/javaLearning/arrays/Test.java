package javaLearning.arrays;

public class Test {

	public static void main(String[] args) {
		/*Emp e= new Emp(1000,"Lenin Kumar Yenni");
		System.out.println(e.empid+e.ename);*/
		
		
		Emp[] E= new Emp[3]; // An array Emp type is created with reference variable E which takes objects of Emp type
		
		Emp e1= new Emp(100, "leni"); // e1 object created of Emp type
		Emp e2= new Emp(200, "Jagg"); // e2 object created of Emp type
		Emp e3= new Emp(300, "Soye");
		
		E[0]=e1; // passing e1 to first box of E
		E[1]=e2;// passing e2 to second box of E
		E[2]=e3;
		
		// if we have all places occupied with objects
		for (int i=0; i< E.length; i++)
		{
			
			System.out.println(E[i].empid+"-"+E[i].ename);
		}
	}

}
