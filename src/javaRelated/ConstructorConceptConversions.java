package javaRelated;

public class ConstructorConceptConversions {
	
		int empid;
		String ename;
		int esal;

		ConstructorConceptConversions(int empid,String ename,int esal)
		{
			this.empid=empid;
			this.ename=ename;
			this.esal=esal;
		}

		void display() {
			System.out.println(empid);
			System.out.println(ename);
			System.out.println(esal);
		} 

		public static void main(String[] args) {
			ConstructorConceptConversions CC = new ConstructorConceptConversions(1,"lenin",50000);
			CC.display();
			ConstructorConceptConversions CC2 = new ConstructorConceptConversions(23,"leninKumar",150000);
			CC2.display();
		}

	}

