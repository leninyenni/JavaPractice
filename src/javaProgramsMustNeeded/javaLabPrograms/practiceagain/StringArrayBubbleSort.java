package javaProgramsMustNeeded.javaLabPrograms.practiceagain;

import java.util.Arrays;

public class StringArrayBubbleSort {
	
	public static void main(String[] args)
	{
		String[] myArray = { "ab", "bc", "ac", "bb", "aa"};
		
		String temp;
		
		//using bubble sorting
		//in this technique we are bubbling out highest string to the last and
		//performing bubble sorting on 0 to n-1 elements now and so on
		for (int i=0;i<myArray.length-1; i++)
		{
			for (int j=0;j<myArray.length-1-i;j++)
			{
				if(myArray[j].compareTo(myArray[j+1])>0)
				{
				temp=myArray[j];
				myArray[j]=myArray[j+1];
				myArray[j+1]= temp;
				}
			}
			//sSystem.out.println(Arrays.toString(myArray));
		}
		System.out.println(Arrays.toString(myArray));
	}
}
