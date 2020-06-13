package collectionsAndLogical;
import java.util.Stack;
/*1) It is a child class of vector
 2) Introduce in 1.0 v legacy class
 3) It is designed for LIFO(last in fist order )*/
public class StackDemo {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("A");
		s.push(10);
		s.push("aaa");
		System.out.println(s);
		s.pop(); //pop() method in Java is used to pop an element from the stack. The element is popped from the top of the stack and is removed from the same. Parameters: The method does not take any parameters. Return Value: This method returns the element present at the top of the stack and then removes it.	
		System.out.println(s);
		System.out.println(s.search("A")); //Stack.search(Object element) method in Java is used to search for an element in the stack and get its distance from the top. This method starts the count of the position from 1 and not from 0. The element that is on the top of the stack is considered to be at position 1.
	}
}
