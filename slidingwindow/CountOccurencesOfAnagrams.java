package slidingwindow;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOccurencesOfAnagrams {


    public static void main(String[] args) {

        String s = "forxxorfxdofr";
        String p = "for";

        System.out.println(countOccurancesOfAnagrams(p, s));

        /*
        Create a map to store p String
        Take 2 pointers i and j, count to store size of map, ans to store count of anagrams
        while j < s.length(),  if map contains any character from s then remove it from map.. if character frequency is 0 then remove from map
        if window size < p.length , j++
        if window size == p.length , check map size if it's zero do ans++
        to shift window, increment i and add ith element to map , if frequency of character then increment count
        i++, j++

    14744444444444444444444444444444444     */

    }


    public static int countOccurancesOfAnagrams(String p, String s) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int x = 0; x < p.length(); x++) {

            map.put(p.charAt(x), map.getOrDefault(p.charAt(x), 0) + 1);
        }

        int i = 0;
        int j = 0;
        int ans = 0;
        int k = p.length();
        int count = map.size();

        while (j < s.length()) {

            if (map.containsKey(s.charAt(j))) {
                map.put(s.charAt(j), map.get(s.charAt(j)) - 1);
                if (map.get(s.charAt(j)) == 0) {

                    count--;
                }
            }
            if (j - i + 1 < k) {

                j++;

            } else if (j - i + 1 == k) {
                if (count == 0) {
                    ans++;
                }

                if (map.containsKey(s.charAt(i))) {

                    map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                    if (map.get(s.charAt(i)) == 1) {
                        count++;
                    }
                }
                i++;
                j++;

            }


        }

        return ans;

    }

}
