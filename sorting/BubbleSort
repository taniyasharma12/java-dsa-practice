package sorting;

public class BubbleSort {

    public static void main(String[] args) {

        int arr[] = {6, 8, 2, 3, 0};
        //6, 8, 2, 3, 0}
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");

        }
    }

    //in each iteration we are moving the largest element to the last
    //arr.length-i-1 because the last elements are already sorted
    //example, at i=0; last element gets sorted, at i=1; second last element gets sorted so these can be ignored
    //The time complexity of Bubble Sort is O(n^2) in the worst-case scenario and the space complexity of Bubble sort is O(1).

    public static int[] bubbleSort(int arr[]) {

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;

    }
}
