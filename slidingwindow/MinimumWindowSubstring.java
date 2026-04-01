package slidingwindow;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class MinimumWindowSubstring {

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        //BANC

        System.out.println(minWindow(s, t));
    }

    public static String minWindow(String s, String t) {
        if (t.length() > s.length()) {
            return "";
        }

// Create a map to store character frequencies of String t
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int x = 0; x < t.length(); x++) {
            map.put(t.charAt(x), map.getOrDefault(t.charAt(x), 0) + 1);
        }

// Sliding window
        int i = 0;
        int j = 0;
        int requiredCount = t.length();
        int minWindowSize = Integer.MAX_VALUE;
        int start_i = 0;

        while (j < s.length()) {
            char currentChar = s.charAt(j);
            if (map.containsKey(currentChar)) {
                if (map.get(currentChar) > 0) {
                    requiredCount--;
                }
                map.put(currentChar, map.get(currentChar) - 1);
            }

// When we have all characters from t in the window
            while (requiredCount == 0) {
// Try to shrink the window
                int currentWindowSize = j - i + 1;
                if (currentWindowSize < minWindowSize) {
                    minWindowSize = currentWindowSize;
                    start_i = i;
                }

// Shrink from the left
                char leftChar = s.charAt(i);
                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);
                    if (map.get(leftChar) > 0) {
                        requiredCount++;
                    }
                }
                i++;
            }

            j++;
        }

// If no valid window was found
        if (minWindowSize == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start_i, start_i + minWindowSize);
    }

}