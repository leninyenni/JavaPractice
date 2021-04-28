package javaLearning.collectionsAndLogical;

import java.util.TreeSet;

//Write a program to insert integer objects into TreeSet where the sorting order is Descending order
public class ComparatorExample {
	
	public static void main(String[] args)
	{
		TreeSet t=  new TreeSet(new MyComparator()); //--- line 1
		TreeSet t1= new TreeSet();
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(10);
		System.out.println(t);
		t1.add(10);
		t1.add(0);
		t1.add(15);
		t1.add(5);
		t1.add(20);
		t1.add(10);
		
		System.out.println(t1);
	}
}
