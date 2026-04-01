package slidingwindow;

import java.net.Inet4Address;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountNumberOfSubArraysWhoseSumIsEqualToK {

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 1, 2}; // prefixSum = 0,1,3,6
        int k = 3;
        System.out.println(countNumberOfSubArraysWhoseSumIsEqualToK(nums, k));
    }

    /*
    0 -> 1      sum-k = -
    1 -> 1      sum-k = -2
    3 -> 1      sum-k = 0
    6 -> 1      sum-k = 3
    7 -> 1      sum-k = 4
    9 -> 1      sum-k = 6
    now if map contains sum -k
     */
    public static int countNumberOfSubArraysWhoseSumIsEqualToK(int[] nums, int k) {

        Map<Integer, Integer> map = new LinkedHashMap<>();

        int sum = 0;
        int count = 0;

        //map will store prefix sum and its count, consider initial sum as 0 and its count as 1

        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];
            if (map.containsKey(sum - k)) {// when i=0, sum = 1, sum-k =1-3 => -2
                //  when i=1, sum = 3, sum-k = 3-3 =0 whose frequency is 1 (0 to 1 index)
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
