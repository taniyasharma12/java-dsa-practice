package maps;

import java.util.LinkedHashSet;
import java.util.Set;

public class ContainsDuplicates {

    public static void main(String[] args) {

        int nums[] = {1, 2, 3};

        System.out.println(containsDuplicates(nums));

    }

    public static boolean containsDuplicates(int nums[]) {

        Set<Integer> set = new LinkedHashSet<>();


        for (int i = 0; i < nums.length; i++) {

            if (!set.contains(nums[i])) {

                set.add(nums[i]);

            } else {

                return true;
            }

        }
        return false;
    }
}
