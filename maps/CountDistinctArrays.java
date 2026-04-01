package maps;

import java.util.LinkedHashSet;
import java.util.Set;

public class CountDistinctArrays {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 2, 1, 4};

        System.out.println(countDistinct(arr));

        //4   // distinct elements = {1, 2, 3, 4}
    }


    public static int countDistinct(int arr[]) {

        Set<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < arr.length; i++) {


            set.add(arr[i]);


        }

        return set.size();
    }


}
