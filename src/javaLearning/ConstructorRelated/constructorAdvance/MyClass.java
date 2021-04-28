package javaLearning.ConstructorRelated.constructorAdvance;
public class MyClass {
	private static MyClass object = null;
	private MyClass() {
		
		System.out.println("hi guys selenium is easy");
	}
	public MyClass getObject() {
		if (object == null) {
			object = new MyClass(); // Creating object using private constructor
		}
		return object;
	}
	
	public static void main(String[] args) {
		
		MyClass obj= new MyClass();
		obj.getObject();
		System.out.println(object);
	}
}
