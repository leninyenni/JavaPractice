package javaLearning.forLoop;

public class ForEachLoop {

	public static void main(String[] args) {
		
		int[][] X= {{10,20,30,40},{50,60}}; //two dimensional array X
		
		for (int[] X1 : X) // for each one dimension array X1 of X
		{
			for (int X2 : X1) // for each integer X2 of one dimension array X1
			{
				System.out.println(X2);
			}
		}

	}

}
