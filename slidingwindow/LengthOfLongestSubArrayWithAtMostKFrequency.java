package slidingwindow;

import java.util.LinkedHashMap;
import java.util.Map;

public class LengthOfLongestSubArrayWithAtMostKFrequency {

    //https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/description/

    public static void main(String args[]) {

        int[] nums = {1, 2, 3, 1, 2, 3, 1, 2,2,2};
        int k = 2;
        System.out.println(maxSubArrayLength(nums, k));
    }


    public static int maxSubArrayLength(int[] nums, int k) {

        Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

        int i = 0;
        int j = 0;
        int result = 0;

        while (j < nums.length) {

            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);

            while (i < j && map.get(nums[j]) > k) {

                map.put(nums[i], map.get(nums[i]) - 1);
                i++;
            }
                result = Math.max(result, j - i + 1);
                j++;

            }
        return result;
    }
}
