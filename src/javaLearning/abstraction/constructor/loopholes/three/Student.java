package javaLearning.abstraction.constructor.loopholes.three;
public class Student extends Person {
	int rollno, marks;
	public Student(String name, int age, int height, int weight, int rollno, int marks) {
		super(name, age, height, weight);
		this.rollno = rollno;
		this.marks = marks;
		System.out.println(this.marks);
		System.out.println(this.rollno);
	}

	public static void main(String[] args) {
		Student student=new Student("ramu", 30,8,60, 1234, 90);


	}
}
