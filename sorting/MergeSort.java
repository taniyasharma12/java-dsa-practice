package sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int arr[] = {8, 9, 3, 5};

        System.out.println(Arrays.toString(mergeSort(arr)));

        //https://www.youtube.com/watch?v=bOk35XmHPKs&t=1083s

    }

    public static int[] mergeSort(int arr[]) {

        int inputLength = arr.length;

        if (arr.length < 2) {
            return arr;
        }


        int midIndex = inputLength / 2;

        int leftHalf[] = new int[midIndex];

        int rightHalf[] = new int[inputLength - midIndex];

        for (int i = 0; i < midIndex; i++) {

            leftHalf[i] = arr[i];
        }

        for (int i = midIndex; i < inputLength; i++) {

            rightHalf[i - midIndex] = arr[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(arr, leftHalf, rightHalf);
        return arr;
    }

    public static void merge(int[] arr, int leftHalf[], int rightHalf[]) {


        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftSize && j < rightSize) {

            if (leftHalf[i] <= rightHalf[j]) {

                arr[k] = leftHalf[i];
                i++;
                k++;
            } else {

                arr[k] = rightHalf[j];
                j++;
                k++;
            }
        }
            while (i < leftSize) {

                arr[k] = leftHalf[i];
                i++;
                k++;
            }

            while (j < rightSize) {

                arr[k] = rightHalf[j];
                j++;
                k++;
            }

        }
    }

