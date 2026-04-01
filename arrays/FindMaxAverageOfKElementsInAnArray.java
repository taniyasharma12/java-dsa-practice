package arrays;

public class FindMaxAverageOfKElementsInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int[] nums = {10, 20, 30, 40, 50};
		int k = 2;
		
		System.out.println(maxAverage(nums, k));
		
	}

	
	public static int maxAverage(int nums[], int k) {
		
		int i=0;
		int j=0;
		int sum=0;
		int maxSum=0;
		
		while(j< nums.length) {
			
			sum+=nums[j];
		
	    if(j-i+1<k) {
	    	
	    	j++;
	    }
	    
	    else if(j-i+1==k) {
	    	
	    	maxSum = Math.max(maxSum, sum);
	    	
	    	sum-=nums[i];
	    	i++;
		    j++;

	    	
	    }
		}
		return maxSum/k;
	
	}
	}

