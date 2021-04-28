package javaLearning.collectionsHarikrishna;

import java.util.Vector;

public class VectorDemo1 {
	public static void main(String[] args) {
		//Vector V=new Vector ();
		Vector V= new Vector(10,5);
		System.out.println(V.capacity());
		for (int i=0;i<=10;i++)
		{
			V.addElement(i);
		}
		System.out.println(V);
		V.addElement('A');
		System.out.println(V.capacity());
		System.out.println(V);
	}
}
