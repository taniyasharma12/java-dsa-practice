package arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class MinimumOperations {

    //TODO

    //https://leetcode.com/problems/make-array-zero-by-subtracting-equal-amounts/submissions/1554041527/

    public static void main(String args[]) {

       int nums[] = {1,5,0,3,5};

        System.out.println(minimumOperations(nums));

    }


    /*
    Create a hashset to add all non-zero elements
    Now the size of the set is the minimum operations required to make array 0
     */
    public static int minimumOperations(int[] nums) {

        Set<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {

                set.add(nums[i]);

            }
        }
        return set.size();

    }
}
