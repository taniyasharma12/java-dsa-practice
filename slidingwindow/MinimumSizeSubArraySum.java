package slidingwindow;

public class MinimumSizeSubArraySum {

    public static void main(String[] args) {

        int nums[] = {1, 1, 4, 4, 2};

        int target = 6;

        System.out.println("ans is : " + minimumSizeSubArraySum(nums, target));

    }

    /*
    Take two pointers i and j and initialize 0
    Take variable to sum to store sum at each step
    Take variable minLength and initialize by Integer.MAX_VALUE
    while j<nums.length, add sum
    when sum <target do j++
    check if sum == target , if yes calculate minLength
    if sum> target , while sum > target minus nums[i], i++;
    if sum==target, calculate minLength
    j++;
     */

    public static int minimumSizeSubArraySum(int arr[], int target) {

        int i = 0;
        int j = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        while (j < arr.length) {

            sum += arr[j];

            if (sum < target) {

                j++;
            } else if (sum == target) {

                minLength = Math.min(j - i + 1, minLength);

                j++;

            } else {

                while (sum > target) {   //7>5

                    sum -= arr[i];//7-2
                    i++;
                    if (sum == target) { //true

                        minLength = Math.min(j - i + 1, minLength);

                    }

                }
                j++;
            }

        }

        return minLength;
    }
}