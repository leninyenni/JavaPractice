package companies.intrvwQustns.dbs;

import java.util.List;

public class checknumberexisting {
	  static String findNumber(List<Integer> arr, int k) {
	        
	        for (int i: arr)
	        {
	            if(k==i)
	            {
	                return "YES";
	            }
	        }

	        return "NO";
	    }
public static void main(String[] args) {
	
}
}
