package maps;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class TwoSum {


    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};

        int target = 9;

        System.out.println(Arrays.toString(twoSum(arr, target)));

        //output => [0,1]
    }


    public static int[] twoSum(int arr[], int target) {

        Map<Integer, Integer> map = new LinkedHashMap<>();

        int complement = 0;

        for (int i = 0; i < arr.length; i++) {

            map.put(arr[i], i);

            complement = target - arr[i];

            if (map.containsKey(complement)) {

                return new int[]{map.get(complement), i};
            }


        }
        return null;

    }


}


