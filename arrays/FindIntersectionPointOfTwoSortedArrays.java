package arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindIntersectionPointOfTwoSortedArrays {

    public static void main(String[] args) {


        int a[] = {1, 1, 2, 2, 2, 4};
        int b[] = {2, 2, 4, 4};
        System.out.println(solution(a, b));

        //Output: {2, 4}
        //Explanation: 2 and 4 are only common elements in both the arrays.

    }

    public static Set<Integer> solution(int[] a, int[] b) {

        int i = 0;
        int j = 0;

        Set<Integer> result = new LinkedHashSet<>();

        while (i < a.length && j < b.length) {

            if (a[i] == b[j]) {
                result.add(a[i]);
                i++;
                j++;

            } else if (a[i] < b[j]) {

                i++;
            } else {
                j++;
            }

        }
        System.out.println(result);

        return result;

    }

}


