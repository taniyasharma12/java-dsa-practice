package maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {

        String s = "xxabceabcbb";

        System.out.println(lengthOfLongestSubstring(s));

    }

    public static int lengthOfLongestSubstring(String s) {

        /*
         Take 2 pointers i and j
         Create a map to store the Character and its frequency
         is map size = j-i=1 then calculate max and start index
         do j++;
         if map size < j-i+1 it means duplicate exists now remove ith element until the condition becomes false

        */

        int i=0;
        int j=0;
        int max=0;

        Map<Character,Integer> map = new LinkedHashMap<>();

        while(j<s.length()) {

            map.put(s.charAt(j), map.getOrDefault(s.charAt(j),0)+1);

            if(map.size()==j-i+1){ //non repeating substring found

                if(j-i+1>max){

                    max=j-i+1;
                }
                j++;
            }
            else if (map.size()<j-i+1) {

                while(map.size()<j-i+1){

                    map.put(s.charAt(i), map.get(s.charAt(i))-1);
                    if(map.get(s.charAt(i))==0){

                        map.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;

            }
        }
        return max;

    }
}