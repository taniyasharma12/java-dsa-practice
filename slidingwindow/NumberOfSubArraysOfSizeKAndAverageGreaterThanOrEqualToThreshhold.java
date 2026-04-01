package slidingwindow;

public class NumberOfSubArraysOfSizeKAndAverageGreaterThanOrEqualToThreshhold {


    public static void main(String[] args) {

        //https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/description/

        int[] arr = {11, 13, 17, 23, 29, 31, 7, 5, 2, 3};
        int k = 3;
        int threshold = 5;
        System.out.println(numOfSubArrays(arr, k, threshold));

    }

    /*
    Take two pointers i and j and initialize as 0
    Take count variable to store number of subArray count
    Take sum variable to store sum
    while j<arr.length, add sum
    if window size(j-i+1<k) then do j++
    if window size(j-i+1==k) then check if sum/k>=5 if yes count++
    now decrement ith element from sum to slide window
    i++, j++;
    return count;
     */

    public static int numOfSubArrays(int arr[], int k, int threshold) {

        int i = 0;
        int j = 0;
        int sum = 0;
        int count = 0;

        while (j < arr.length) {

            sum += arr[j];

            if (j - i + 1 < k) {

                j++;

            } else if (j - i + 1 == k) {

                if (sum / k >= threshold) {
                    count++;
                }

                sum -= arr[i];
                i++;
                j++;

            }

        }
        return count;

    }
}



