package maps;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Leetcode1814 {


    public static void main(String[] args) {

        int nums[] = {42, 11, 1, 97};
        // 24-42, 11-11, 1-1, 97-79
        //-18,0,0,-18

        System.out.println(countNicePairs(nums));
    }

    public static int countNicePairs(int[] nums) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            list.add(nums[i]-reverse(nums[i]));

        }

        System.out.println(list);
        int count =0;

        Map<Integer,Integer> map = new LinkedHashMap<>();

        for(int i=0; i<list.size(); i++) {

            if(map.containsKey(list.get(i))){

                count+=map.get(list.get(i));
            }

            map.put(list.get(i), map.getOrDefault(list.get(i),0)+1);
        }
        return count;

    }

    public static int reverse(int num) {

        int temp = num;

        int rev = 0;

        while (temp > 0) {

            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        return rev;
    }
}
