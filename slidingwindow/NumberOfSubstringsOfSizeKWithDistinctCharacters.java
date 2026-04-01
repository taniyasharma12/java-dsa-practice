package slidingwindow;

import java.util.LinkedHashMap;
import java.util.Map;

public class NumberOfSubstringsOfSizeKWithDistinctCharacters {

    public static void main(String[] args) {

        String str = "aababcabc";

        //total substrings of size 3 -> abc,bca,cab,abc,
        int k = 3;

        System.out.println(countGoodSubstrings(str, k));

    }

     /*
        Create a HashMap to store character and frequency of the String
        Initiate two pointers i and j = 0;
        Take count variable to store count of characters
        while j < str.length, add character to map
        if window(j-i+1)<k then j++;
        if window(j-i+1)==k then check if map.size is equal to k (it means all distinct characters are present) if yes count++;
        now decrement ith character from map/remove ith character if size is 0, since we need to slide the window
        i++, j++;
        return count;

         */

    public static int countGoodSubstrings(String str, int k) {

        int i = 0;
        int j = 0;
        int count = 0;

        Map<Character, Integer> map = new LinkedHashMap<>();

        while (j < str.length()) {

            map.put(str.charAt(j), map.getOrDefault(str.charAt(j), 0) + 1);

            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (map.size() == k) {

                    count++;
                }
                map.put(str.charAt(i), map.get(str.charAt(i)) - 1);
                if (map.get(str.charAt(i)) == 0) {

                    map.remove(str.charAt(i));
                }
                i++;
                j++;
            }
        }
        return count;
    }
}