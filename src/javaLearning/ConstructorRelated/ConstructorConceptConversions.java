package javaLearning.ConstructorRelated;

public class ConstructorConceptConversions {
		int empid=0;
		String ename=null;
		int esal=0;
		static int z=0;
		ConstructorConceptConversions(int empid,String ename,int esal)
		{
			this.empid=empid;
			this.ename=ename;
			this.esal=esal;
			this.z=1000;
		}
		void display() {
			System.out.println(empid);
			System.out.println(ename);
			System.out.println(esal);
			System.out.println(z);
		}
		public static void main(String[] args) {
			ConstructorConceptConversions CC = new ConstructorConceptConversions(1,"anusha",50000);
			CC.display();
			z=500;
			System.out.println(z);
			ConstructorConceptConversions CC2 = new ConstructorConceptConversions(23,"rahul",35000);
			CC2.display();
		}
	}

