package javaLearning.encapsulation;

public class Child extends Parent{


	public static void main(String[] args) {
		
		
		Child c= new Child();
		System.out.println(c);
		//primitive return type
		c.setBal(1000);
		System.out.println(c.getBal());
		//reference type
		c.setCc(c);
		System.out.println(c.getCc()); // printing child class object

		Parent p= (Parent) c; //converting child class object to parent type
		c.setpp(p); // passing parent type child object
		System.out.println(c.getpp());// printing passed parent type child object

		c.setpp(c); // we can pass child object even though reference type is parent since we are extending Parent class
		System.out.println(c.getpp());
	}

}
