package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortArrayByIncreasingFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums [] = {-1,1,-6,4,5,-6,1,4,1};
		
		System.out.println(frequencySort(nums));
	}

	public static String frequencySort(int[] nums) {
		 Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();

	      for(int i=0; i<nums.length; i++){

	        map.put(nums[i], map.getOrDefault(nums[i],0)+1);
  
	}

	//add map values to a list and sort
	      
	      List<Integer> list = new ArrayList(map.keySet());
	      
	      Collections.sort(list, (a,b)-> {
	    	  
	    	  if(map.get(a)!=map.get(b)) {
	    		  
	    		  return map.get(a)-map.get(b);
	    // if freq of numbers are not equal then return in increasing order based on freq.
	    	  }
	    	  else {
	    		  
	    		  return b-a; 
	    // otherwise sort them in decreasing order based on number in nums.

	    	  }
	      });
	      	
	      int k =0;
	      for(int i=0; i<list.size(); i++) {
	    	  for(int j=0; j<map.get(list.get(i)); j++) {
	    		  
		    	  nums[k]=list.get(i);
                   k++;
	    	  }
	    	  
	      }
	      
	      return Arrays.toString(nums);
}
}

/**
 * @author TaniyaSharma
 *
 */
