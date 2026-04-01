package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayElementRemoval {

    public static void main(String[] args) {

        int[][] bigArr = {{1, 3}, {4, 6}, {8, 12}};

        int[] filteredArr = {3, 6};

        List<ArrayList<Integer>> bigList = new ArrayList<>();

        bigList.add(new ArrayList<>(Arrays.asList(1, 3)));
        bigList.add(new ArrayList<>(Arrays.asList(4, 6)));
        bigList.add(new ArrayList<>(Arrays.asList(8, 12)));

        List<Integer> filteredList = Arrays.asList(3, 6);

        List<ArrayList<Integer>> result = new ArrayList<>();


        for (ArrayList<Integer> subList : bigList) {

            boolean containsFiltered = false;

            for (Integer num : subList) {

                if (filteredList.contains(num)) {

                    containsFiltered = true;
                    break;

                }
            }
            if (containsFiltered == false) {

                result.add(subList);
            }

        }
        System.out.println(result);
    }
}
