package javaLearning.arrays.javaConceptOfTheDay;

import java.util.Arrays;

public class ArrayEqualityUsingEqualsMethod {
	
	public static void main(String[] args) {
		
		int[] FirstArray= {10,2,15,236};
		int[] SecondArray= {10,2,15,232};
		
		System.out.println(Arrays.equals(FirstArray, SecondArray));
		
		System.out.println(Arrays.toString(FirstArray));
	}
}
