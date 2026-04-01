package sorting;

public class InsertionSort {


    public static void main(String[] args) {

        int arr[] = {8, 9, 3, 5, 1, 2, 10, 12, 11, 48, 23, 25};

    }


    public static int[] insertionSort(int nums[]) {

        for (int i = 1; i < nums.length; i++) {

            int key = nums[i];

            int j = i - 1;

            while (j >= 0 && nums[j] > key) {

                //key is 3, nums[j] is 9 9>3 so we need to place the nums[j] one place ahead
                nums[j+1]= nums[j];
                j--;
            }

            //now assign the key to the
            nums[j+1]=key;


        }

        return nums;
    }

}
