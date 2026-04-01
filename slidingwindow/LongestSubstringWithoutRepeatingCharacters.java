package slidingwindow;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {

        String str = "xxabceabcbb"; //output -> abce

        System.out.println(solution(str));

    }

    public static int solution(String str) {


        int i = 0;
        int j = 0;
        int max = 0;
        int start_index = 0;
        Map<Character, Integer> map = new LinkedHashMap<>();

        while (j < str.length()) {

            map.put(str.charAt(j), map.getOrDefault(str.charAt(j), 0) + 1);

            // CASE 1: valid window (all unique)
            if (map.size() == j - i + 1) {
                if (j - i + 1 > max) {
                    max = j - i + 1;
                    start_index = i;
                }
                j++; // expand window
            }

            // CASE 2: duplicates present
            else { // map.size() < window size

                while (map.size() < j - i + 1) {

                    map.put(str.charAt(i), map.get(str.charAt(i)) - 1);

                    if (map.get(str.charAt(i)) == 0) {
                        map.remove(str.charAt(i));
                    }
                    i++; // shrink window
                }

                j++; // after shrinking, expand again
            }
        }

        System.out.println(str.substring(start_index, start_index + max));
        return max;
    }
}