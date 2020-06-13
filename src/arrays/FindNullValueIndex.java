package arrays;

public class FindNullValueIndex {

	public static void main(String[] args) {
		Emp[] EE= new Emp[5];
		Emp e1= new Emp(100, "leni");
		Emp e2= new Emp(200, "Jagg");
		EE[0]=e1;
		EE[2]=e2;
		
		for (int i=0;i<EE.length;i++)
		{
			if (EE[i]==null)
			{
				System.out.println(i);
			}
		}
 	}

}
