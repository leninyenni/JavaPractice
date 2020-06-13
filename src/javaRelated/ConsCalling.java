package javaRelated;

public class ConsCalling {

	//always this should be the first statement
	ConsCalling() {
		this(10);
		System.out.println("1");
	}

	ConsCalling(int a) {
		this(10,20);
		//this(10); cannot call two constructors at a  time
		System.out.println("2");
	}

	ConsCalling(int a, int b) {
		System.out.println("3");
	}

	public static void main(String[] args) {
		
		ConsCalling CC=new ConsCalling();
	}
}
