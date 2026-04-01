package slidingwindow;

public class MaximumAverageOfSubarrayLeetcode {

    public static void main(String[] args) {


        int nums[] = {1, 12, -5, -6, 50, 3};
        int k = 4;

        System.out.println(maximumAverageSubarrayLeetcode(nums, k));
    }


    public static int maximumAverageSubarrayLeetcode(int arr[], int k) {

        int i = 0;
        int j = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        while (j < arr.length) {

            sum += arr[j];

            if (j - i + 1<k) {
                j++;
            }

            else if (j - i + 1==k) {
                maxSum = Math.max(sum, maxSum);
                sum -= arr[i];

                i++;
                j++;
            }
        }
            return maxSum/k;
        }
    }

