package sorting;

import java.util.Arrays;

public class SelectionSort {


//number of swap reduces as compared to bubble sort
//only on swap happens in one i iteration

/*
        Selection Sort repeatedly selects the smallest (or largest) element from the unsorted portion of the array
        and moves it to the correct position in the sorted portion.

        First, find the index of the minimum element in the unsorted part.

        Then, do a single swap after the inner loop ends.

         */

    //the time complexity of Selection Sort is O(N2)

    public static void main(String[] args) {

        int arr[] = {6, 8, 2, 3, 0};
        //6, 8, 2, 3, 0}
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    public static int[] selectionSort(int arr[]) {

        int temp = 0;
        int min_index = 0;

        for (int i = 0; i < arr.length; i++) {
            min_index = i;

            for (int j = i + 1; j < arr.length; j++) {


                if (arr[min_index] > arr[j]) {

                    min_index = j;
                }
            }
            temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
}
