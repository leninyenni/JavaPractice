package javaLearning.arrays;

public class Point4 {

	public static void main(String[] args) {
		Animal[] A= new Animal[3];
		A[0]= new Animal();
		A[1]= new Dog();
		A[2]= new Puppy();
		
		for (Animal AA:A)
		{
			//AA.m1(); // because of inheritance we can see m1 method all over subclasses
			if (AA instanceof Animal)
			{
				AA.m1();
			}
			if (AA instanceof Dog)
			{
				((Dog) AA).m2();
			}
			if (AA instanceof Puppy)
			{
				((Puppy) AA).m3();
			}
		}

	}

}
