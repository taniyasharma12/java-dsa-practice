package arrays.multidimensional;

public class HourglassSumMaximum {

    public static void main(String[] args) {

        int[][] nums = {
                {9, -9, -9, 1, 1, 1},
                {0, -9, 0, 4, 3, 2},
                {-9, -9, -9, 1, 2, 3},
                {0, 0, 8, 6, 6, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };

        System.out.println(maxHourglassSum(nums));
    }


    public static int maxHourglassSum(int[][] nums) {

        int maxSum = Integer.MIN_VALUE;

        int sum = 0;

        for (int i = 0; i < nums.length-3; i++) {

            for (int j = 0; j < nums.length-3; j++) {

                sum = nums[i][j] + nums[i][j + 1] + nums[i][j + 2] + nums[i + 1][j + 1] + nums[i + 2][j] + nums[i + 2][j + 1] + nums[i + 2][j + 2];

                maxSum = Math.max(sum, maxSum);
            }
        }

        return maxSum;
    }
}
