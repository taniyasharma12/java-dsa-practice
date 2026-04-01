package strings;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramsInAString {

    public static void main(String[] args) {


        String s = "cbaebabacd";
        String p = "abc";

        System.out.println(allAnagrams(s,p));
    }

    public static List<Integer> allAnagrams(String s, String p) {

        //using sliding window
        //store the p character and frequency in a hashmap
        Map<Character, Integer> map = new LinkedHashMap<>();

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < p.length(); i++) {

            map.put(p.charAt(i), map.getOrDefault(p.charAt(i), 0) + 1);
        }

        int count = map.size();

        int i = 0;

        int j = 0;

        int k = p.length();

        while (j < s.length()) {

            char ch = s.charAt(j);

            if (map.containsKey(ch)) {

                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0) {
                    count--;
                }

            }

            if (j - i + 1 < k) {

                j++;

            } else if (j - i + 1 == k) {

                if (count == 0) {

                    result.add(i);

                }

                if (map.containsKey(s.charAt(i))) {

                    map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                    if (map.get(s.charAt(i)) == 1) {
                        count++;
                    }
                }

                j++;
                i++;

            }


        }
        return result;

    }


}
