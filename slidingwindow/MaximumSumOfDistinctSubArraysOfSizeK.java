package slidingwindow;

import javax.swing.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class MaximumSumOfDistinctSubArraysOfSizeK {

    public static void main(String[] args) {

        int nums[] = {1, 5, 4, 2, 9, 9, 9}; //9+2+4
        int k = 3;
        System.out.println(maximumSumOfDistinctSubArraysOfSizeK(nums, k));

    }


    public static int maximumSumOfDistinctSubArraysOfSizeK(int nums[], int k) {

        //create a HashMap to store Element and it's frequency
        //take sum
        //when you hit the window check if k == map.size it means all unique elements are there, find max
        //decrement the ith element from map by 1, if map.get == 0 remove ith element from i
        //decrease ith element from sum

        Map<Integer, Integer> map = new LinkedHashMap<>();

        int i = 0;
        int j = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        while (j < nums.length) {

            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);

            sum += nums[j];

            if (j - i + 1 < k) {

                j++;
            } else if (j - i + 1 == k) {

                if (map.size() == k) {

                    maxSum = Math.max(sum, maxSum);
                    map.put(nums[i], map.get(nums[i]) - 1);
                    if (map.get(nums[i]) == 0) {

                        map.remove(nums[i]);

                    }

                    sum -= nums[i];
                }

                i++;
                j++;

            }


        }
        return maxSum;
    }

}
