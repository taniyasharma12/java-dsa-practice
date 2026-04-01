package strings;

public class ValidAnagrams {

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s,t));

    }


    public static boolean isAnagram(String s, String t) {

        if (s == null || t == null) {
            return false;
        }

        if (s.length() != t.length()) {
            return false;
        }
        s = s.toLowerCase();
        t = t.toLowerCase();
        int char_count[] = new int[26];
        //I’m using an array of size 26 assuming the input contains only lowercase English letters.
        // If not, I can switch to a HashMap or a 256-size array.

        for (int i = 0; i < s.length(); i++) {

            char_count[s.charAt(i) - 'a']++;
            char_count[t.charAt(i) - 'a']--;

        }

        for (int i = 0; i < 26; i++) {

            if (char_count[i] != 0) {

                return false;
            }
        }
        return true;
    }

//✔ Time: O(n)
//✔ Space: O(1)


}
