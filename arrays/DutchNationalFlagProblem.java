package arrays;

import java.util.Arrays;

public class DutchNationalFlagProblem {

    //https://leetcode.com/problems/sort-colors/description/

    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 0, 1, 2};

        System.out.println(Arrays.toString(solution(arr)));

    }


    //Set the tone for the week ahead with purpose and passion — make a plan, take action, and watch your efforts pay off. 📝 ✅


    public static int[] solution(int arr[]) {

        int i = 0; //for 0
        int j = 0; //for 1
        int k = arr.length - 1; //for 2

        while (i <= k && j <= k) {

            if (arr[j] == 1) {

                j++;
            } else if (arr[j] == 2) {

                swap(arr,j,k);
                k--;
            } else { //arr[j]=0;

                swap(arr, j, i);
                i++;
                j++;
            }

        }
        return arr;
    }


    public static void swap(int arr[], int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
