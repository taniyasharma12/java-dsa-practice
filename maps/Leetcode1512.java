package maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Leetcode1512 {

    public static void main(String[] args) {

        int nums [] = {1,2,3,1,1,3};

        //A pair (i, j) is called good if nums[i] == nums[j] and i < j.

    }

    public int numIdenticalPairs(int[] nums) {


        int count =0;

        Map<Integer,Integer> map = new LinkedHashMap<>();

        for(int i=0; i<nums.length; i++) {

            if(map.containsKey(nums[i])){

                count+=map.get(nums[i]);
            }

            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        return count;
    }

}
