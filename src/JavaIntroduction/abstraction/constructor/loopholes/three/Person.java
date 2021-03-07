package JavaIntroduction.abstraction.constructor.loopholes.three;

abstract class Person {
	
	String name;
	int age;
	int height;
	int weight;
	
	public Person(String name,int age,int height,int weight)
	{
		super();
		this.name=name;
		this.age=age;
		this.height=height;
		this.weight=weight;
		System.out.println("hey you are executing Abstract Parent Class constructor");
		System.out.println(this.name+"--"+this.age+"--"+this.height+"--"+this.weight);
	}
}
