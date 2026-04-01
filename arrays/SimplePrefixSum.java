package arrays;

import java.util.Arrays;

public class SimplePrefixSum {

    public static void main(String[] args) {

        int nums[] = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(prefixSum1(nums)));

        System.out.println(Arrays.toString(prefixSum(nums)));


        //[1, 3, 6, 10, 15]
    }

    public static int[] prefixSum(int nums[]) {

        //modifying original array

        for (int i = 1; i < nums.length; i++) {

            nums[i] = nums[i - 1] + nums[i];
        }

        return nums;

    }

    public static int[] prefixSum1(int nums[]){

        //by creating new array

        int prefix[]= new int[nums.length];

        prefix[0] = nums[0];

        for (int i=1; i<nums.length; i++) {

            prefix[i] = prefix[i-1] + nums[i];
        }

        return prefix;
    }
}
