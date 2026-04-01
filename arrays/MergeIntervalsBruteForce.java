package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervalsBruteForce {

    public static void main(String[] args) {

        int nums[][] = {{1, 3}, {8, 10}, {15, 18}, {2, 6}};

        //

        mergeIntervals(nums);

    }

    //brute

    public static List<int[]> mergeIntervals(int[][] nums) {

        Arrays.sort(nums, (a, b) -> {

            return a[0] - b[0];
        });

        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            int start = nums[i][0];
            int end = nums[i][1];

            if (!result.isEmpty() && end <= result.get(result.size() - 1)[1]) {

                continue;
            }

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[j][0] <= end) {

                    end = Math.max(nums[j][1], end);
                } else {

                    break;
                }


            }

            result.add(new int[]{start, end});
        }

        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(0).length; j++) {

                System.out.print(result.get(i)[j] + " ");
            }
            System.out.println();
        }
        return result;
    }
}
