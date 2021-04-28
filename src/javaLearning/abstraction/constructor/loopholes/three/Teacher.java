package javaLearning.abstraction.constructor.loopholes.three;

public class Teacher extends Person {
	
	String sub;
	double salary;
	
	Teacher(String name,int age, int height,int weight, String sub,double salary)
	{
		super(name,age,height,weight);
		this.sub=sub;
		this.salary=salary;
	}
}
