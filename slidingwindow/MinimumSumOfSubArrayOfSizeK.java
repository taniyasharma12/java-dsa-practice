package slidingwindow;

public class MinimumSumOfSubArrayOfSizeK {


    public static void main(String[] args) {

        int arr[] = {100, 200, 300, 400}; //600
        int k = 3;
        System.out.println(minimumSumSubArray(arr, k));
    }

    /*
    Take two pointers i and j and initialize by 0
    Take sum variable to store sum at each step and minSum to store minimum sum(initialize as INTEGER.MAX)
    while j< arr.length, take sum
    if j-i+1<k then do j++
    if j-i+1==k, take minimum sum
    remove ith element from sum to slide window
    i++, j++
     */

    public static int minimumSumSubArray(int arr[], int k) {

        int i = 0;
        int j = 0;
        int sum = 0;
        int minSum = Integer.MAX_VALUE;

        while (j < arr.length) {

            sum += arr[j];

            if (j - i + 1 < k) {

                j++;
            } else if (j - i + 1 == k) {

                minSum = Math.min(sum, minSum);

                sum = sum - arr[i];
                i++;
                j++;
            }
        }

        return minSum;
    }
}
