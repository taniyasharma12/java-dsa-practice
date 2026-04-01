package maps;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {

    }


    public int[] intersection(int[] nums1, int[] nums2) {

        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int num : nums1) set.add(num);

        for (int num : nums2) {
            if (set.contains(num) && !result.contains(num)) {
                result.add(num);
            }
        }

        int[] output = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            output[i] = result.get(i);
        }

        return output;
    }
}

