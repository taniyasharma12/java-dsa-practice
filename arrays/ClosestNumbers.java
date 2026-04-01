package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClosestNumbers {

    public static void main(String[] args) {

        int nums[] = {5, 4, 3, 2};
        //2 3 3 4 4 5

        System.out.println(solution(nums));

    }

    public static List<Integer> solution(int nums[]) {

        Arrays.sort(nums);

        int minDiff = Integer.MAX_VALUE;

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i++) {

            int diff = Math.abs(nums[i] - nums[i + 1]);

            minDiff = Math.min(diff, minDiff);

        }
        for (int i = 0; i < nums.length - 1; i++) {

            int diff = Math.abs(nums[i] - nums[i + 1]);

            if (diff == minDiff) {

                list.add(nums[i]);
                list.add(nums[i+1]);

            }

        }
        return list;
    }
}
