package slidingwindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FirstNegativeNumberInEveryWindowofSizeK {

    public static void main(String[] args) {

        int[] arr = {12, 90, 78, -1, -7, 8, -15, 30, 16, 28};

        int k = 3;

        System.out.println(firstNegativeNumberInEveryWindowofSizeK(arr, k));


    }


    public static List<Integer> firstNegativeNumberInEveryWindowofSizeK(int arr[], int k) {

        int i = 0;
        int j = 0;

        List<Integer> negatives = new ArrayList<>();

        List<Integer> result = new ArrayList<>();

        while (j < arr.length) {
            // Add negative numbers to the list
            if (arr[j] < 0) {
                negatives.add(arr[j]);
            }
            // If window size is less than k, just expand the window
            if (j - i + 1 < k) {
                j++;
            }
            // When window size becomes k
            else if (j - i + 1 == k) {
                // If there are negative numbers in the current window, add the first one
                if (!negatives.isEmpty()) {
                    result.add(negatives.get(0));
                    // If the element at arr[i] is the first negative number, remove it
                    if (arr[i] == negatives.get(0)) {
                        negatives.remove(0);
                    }
                } else {
                    // If no negative number, add 0 (or use another placeholder like `null`)
                    result.add(0);
                }
                // Slide the window
                i++;
                j++;
            }
        }
        return result;
    }
}

