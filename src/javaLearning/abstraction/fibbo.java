package javaLearning.abstraction;

public class fibbo {
	public static void main(String[] args) {
		int i =0,j = 1;
		int k = 0;
		System.out.println(i);
		System.out.println(j);
		while(j < 100){
			k = i + j;
			System.out.println(k);
			i = j;
			j = k;
			
		}
		
	}
}
