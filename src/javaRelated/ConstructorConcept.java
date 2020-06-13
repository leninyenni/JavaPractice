package javaRelated;

public class ConstructorConcept {
	int empid;
	String ename;
	int esal;

	//constructor being called when object creation.Means variables are initiated
	/*ConstructorConcept() {
		empid = 1;
		ename = "Lenin";
		esal = 50000;
	}*/ 

	void display() {
		System.out.println(empid);
		System.out.println(ename);
		System.out.println(esal);
	} 

	public static void main(String[] args) {
		ConstructorConcept CC = new ConstructorConcept();
		CC.display();
	}

}
