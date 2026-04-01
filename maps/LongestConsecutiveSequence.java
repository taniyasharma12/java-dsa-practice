package maps;

import java.util.LinkedHashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {

        int[] nums = {100, 4, 200, 1, 3, 2};

        System.out.println(longestConsecutive(nums));

        //The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

    }

    public static int longestConsecutive(int[] nums) {

        int longest =0;

        Set<Integer> set = new LinkedHashSet<>();

        for(int num : nums) {

            set.add(num);

        }

        for(int num : set){

            if(!set.contains(num-1)) {

                int current = num;
                int count =1;

                while(set.contains(current+1)) {
                    current++;
                    count++;

                }

                longest = Math.max(longest,count);

            }


        }
        return longest;
    }
}