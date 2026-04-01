package Arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class ThirdMaximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums [] = {1,2};
		System.out.println(thirdMax(nums));
	}
	
public static int thirdMax(int[] nums) {

		
		long max = Long.MIN_VALUE;
		long secondMax = Long.MIN_VALUE;
		long thirdMax = Long.MIN_VALUE;
		
		
		for(int i=0; i<nums.length; i++) {
			
			if(nums[i]>max) {
                thirdMax=secondMax;
                secondMax= max;
				max = nums[i];				
			}
			
			else if(nums[i]>secondMax && nums[i]!=max) {
				
				thirdMax=secondMax;
				secondMax= nums[i];
				
			}
			else if(nums[i]> thirdMax && nums[i]!=max && nums[i]!=secondMax) {
				
				thirdMax=nums[i];
			}
		}
		
		return thirdMax==Long.MIN_VALUE? (int)max:(int)thirdMax;
	}
	
}
/*	public static int thirdMax(int[] nums) {
		Set<Integer> set = new LinkedHashSet<>();
		        for(int i=nums.length-1; i>=0; i--){
		            set.add(nums[i]);
		        }
		        
   int [] result = new int[set.size()];
   
   Iterator<Integer> it =  set.iterator();
			 
   while(it.hasNext()) {
			 for(int i=0; i<result.length; i++) {
				 
				 result[i] = it.next();
			 
		 }
	}
   
   Arrays.sort(result);
   if(result.length<3) {
	   return result[result.length-1];
   }
   return result[result.length-3];
		}
		*/
