package arrays;

import java.util.*;

public class ThreeSum {


    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};
        //sorted -4,-1,-1,0,1,2
        System.out.println(threeSum(nums));
    }


    public static List<List<Integer>> threeSum(int nums[]) {

        /*
        Create a set so that we only store unique pairs
        Iterate through loop till only nums.length-2 because we want 3 elements
        take first element as i , second element as left i+1, third element as nums.length-1
        Sort the array
        while left<right, add current, left and right element if its equal to add to list and add the list to set and do left++, right--
        if current, left and right element sum is <0 left++;
        if current, left and right element sum is >0 right++;
        Return ArrayList of set!
         */

        Arrays.sort(nums);
        Set<List<Integer>> set = new LinkedHashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[left] + nums[right] + nums[i];

                if (sum == 0) {
                    set.add(Arrays.asList(nums[left], nums[right], nums[i]));
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {

                    right--;

                }

            }
        }

        return new ArrayList<>(set);
    }
}




