package seleniumPrograms.Notes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListWorkAround {
	
	public static void main(String args[])
	{
		List<String> l1= new ArrayList<String>();
		List<String> l2= new ArrayList<String>();
		
		l1.add("Lenin");
		l1.add("yenni");
		l1.add("Kumar");
		
		l2.add("Kumar");
		l2.add("Lenin");
		l2.add("yenni");
		
		System.out.println(l1);
		System.out.println(l2);
		if(l1.equals(l2))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
		
		
		Collections.sort(l2);
		
		System.out.println(l1);
		System.out.println(l2);
		
		if(l1.equals(l2))
		{
			System.out.println("passed");
		}
		
	
	}
}
