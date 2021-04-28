package javaLearning.ConstructorRelated.thisKeyword;

public class ConsCalling {

	//always this should be the first statement
	ConsCalling() {
		this(10);
		System.out.println("zero arugmented constructor");

	}

	ConsCalling(int a) {
		this(10,20);
		//this(10); cannot call two constructors at a  time
		System.out.println("single argumented constructor");
	}

	ConsCalling(int a, int b) {
		System.out.println("two arugmented constructor");

	}

	public static void main(String[] args) {
		
		ConsCalling CC=new ConsCalling();
	}
}
