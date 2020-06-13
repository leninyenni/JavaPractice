package arrays;

public class Point3 {
	// We know Array is group of elements of homogenous type 
	//Object Array
	public static void main(String[] args) {
		Object[] O = new Object[3];
		
		O[0]= new Emp(111,"len");
		O[1]= new Student(12,"kum");
		O[2]= new Integer(10);
		
		for (Object oo : O)
		{
			if(oo instanceof Emp)
			{
				Emp e= (Emp) oo; // converting oo type object to Emp object type
				System.out.println(e.empid+"-"+e.ename);
			}
			if (oo instanceof Student)
			{
				Student s= (Student) oo; //type casting i.e converting oo object type to student object type
				System.out.println(s.sid+"-"+s.sname);
			}
			if (oo instanceof Integer)
			{
				System.out.println(oo);
			}
		}
	}

}
