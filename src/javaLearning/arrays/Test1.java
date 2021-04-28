package javaLearning.arrays;

public class Test1 {

	public static void main(String[] args) {
		Emp[] E= new Emp[3];
		
		Emp e1= new Emp(100, "leni");
		Emp e2= new Emp(200, "Jagg");
		Emp e3= new Emp(300, "Soye");
		
		E[0]=e1;
		
		E[2]=e3;
		
		// if we have all places not occupied with objects
		for (Object o: E)
		{
			if (o instanceof Emp)
			{
				Emp E1= (Emp) o;
				System.out.println(E1.empid+"-"+E1.ename);
			}
			else
			{
				System.out.println("null");
			}
		}
	}
	}


