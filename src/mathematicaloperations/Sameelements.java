package mathematicaloperations;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
 

public class Sameelements {

	
	
	public static boolean areSame(Integer arr[])
	    {
	        
	        Set<Integer> s = new HashSet<>(Arrays.asList(arr));
	 
	       
	        return (s.size() == 1);
	    }
	 
	    
	public static void main(String[] args)
	    {
	        Integer[] arr = { 1, 2, 2,1 };
	        if (areSame(arr))
	            System.out.println("All Elements are Same");
	        else
	            System.out.println("Not all Elements are Same");
	    }
	}


