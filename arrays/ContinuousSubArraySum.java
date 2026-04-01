package arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class ContinuousSubArraySum {

    public static void main(String[] args) {

        int[] nums = {23, 2, 4, 6, 7};
        int k = 6;
        System.out.println(continuousSubArraySum(nums, k));

        /*

        create a hashmap and store the remainder with k and its index

        23 % 6     ->   5, 0
        23+2 % 6   ->   1, 1
        23+2+4 % 6 ->   5, 2   = true

         */

    }

    //https://leetcode.com/problems/continuous-subarray-sum/description/

    /*
    A good sub array is a sub array where:
    its length is at least two, and
    the sum of the elements of the sub array is a multiple of k.
     */

    public static boolean continuousSubArraySum(int nums[], int k) {
        int sum = 0;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            int rem = (k == 0) ? sum : sum % k;

            if (map.containsKey(rem)) {
                if (i - map.get(rem) >= 2) {
                    return true;
                }
            } else {
                map.put(rem, i); // ✅ don’t overwrite
            }
        }
        return false;
    }
}
