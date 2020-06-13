package collectionsAndLogical;

import java.util.Comparator;

public class MyComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		/*if (i1 < i2)
			return +1;
		else if (i1 > i2)
			return -1;
		else 
			return 0;*/ //logic 1
		
		//return i1.compareTo(i2); logic 2--default natural sorting order i.e ascending order [0, 5, 10, 15, 20]
		//return -i1.compareTo(i2); logic 3-- Descending order  i.e [20, 15, 10, 5, 0]
		//return i2.compareTo(i1); logic 4-- Descending order  i.e [20, 15, 10, 5, 0]
		//return -i2.compareTo(i1); logic 5-- Ascending order [0, 5, 10, 15, 20]
		//return +1;  logic 6-- insertion order [10,0,15,5,20,20]
		// return -1; logic 7-- reverse of insertion order [20,20,5,15,0,10]
		return 0; //logic 8-- only first element will be inserted and all remaining will be considered as duplicates so output is [10]
	}
	
	
}
