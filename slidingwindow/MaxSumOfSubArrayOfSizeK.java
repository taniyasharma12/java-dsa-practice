package slidingwindow;

public class MaxSumOfSubArrayOfSizeK {

    public static void main(String[] args) {

        int arr[] = {100, 200, 300, 400};

        int k = 3;

        System.out.println(maxSumSubArray(arr, k));

    }

    public static int maxSumSubArray(int arr[], int k) {

        int i = 0;
        int j = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        while (j < arr.length) {

            sum += arr[j];

            if (j - i + 1<k) {

                j++;
            } else if (j - i + 1 == k) {

                maxSum = Math.max(sum, maxSum);

                sum -= arr[i];

                i++;
                j++;

            }

        }


        return maxSum;


    }


}