package wrapperClasses;
/*
If you pass a string other than true or false to the second constructor of Boolean wrapper class, the object is initialized with false.*/

public class BooleanWrapperFeature {
	public static void main(String[] args) {
		Boolean BLN1 = new Boolean("true"); // passed string "true"
		System.out.println(BLN1); // output : true
		Boolean BLN2 = new Boolean("false"); // passed string "false"
		System.out.println(BLN2); // output : false
		Boolean BLN3 = new Boolean("abc"); // passed string "abc"
		System.out.println(BLN3); // output : false
		
		char c='a';
		int a=(int)c;  //converting char to int which we call upcasting or widening
		System.out.println(a);
		
		char d=(char)a; //converting int to char which we call downcasting or narrowing
		System.out.println(d);
		
	}
}
