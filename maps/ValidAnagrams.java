package maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class ValidAnagrams {


    public static void main(String[] args) {

        String s1 = "LISTEN";
        String s2 = "SILENT";

        System.out.println(isAnagramUsingMap(s1, s2));

    }

    public static boolean isAnagramUsingASCII(String s1, String s2) {

        //using ASCII value

        if (s1.length() != s2.length()) {

            return false;
        }

        int[] char_count = new int[26];

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        for (int i = 0; i < s1.length(); i++) {

            char_count[s1.charAt(i) - 'a']++;
            char_count[s2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (char_count[i] != 0) {

                return false;
            }

        }
        return true;
    }


    public static boolean isAnagramUsingMap(String s1, String s2) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < s1.length(); i++) {

            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);

        }
        for (int i = 0; i < s2.length(); i++) {

            map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i), 0) - 1);

        }

        for (Map.Entry<Character, Integer> element : map.entrySet()) {

            if (element.getValue() != 0) {
                return false;
            }

        }

        return true;

    }
}

/*
Time Complexity -> O(n)
Space complexity -> O(k)
 */