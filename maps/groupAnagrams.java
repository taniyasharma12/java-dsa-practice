package maps;

import java.util.*;

public class groupAnagrams {

    public static void main(String[] args) {

        String strs[] = {"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println(groupAnagrams(strs));
        // Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
    }


    public static List<List<String>> groupAnagrams(String[] strs) {

        //store sorted string and its corresponding string in a list

        Map<String, List<String>> map = new LinkedHashMap<>();

        for (int i = 0; i < strs.length; i++) {

            char ch[] = strs[i].toCharArray();

            Arrays.sort(ch);

            String sortedString = Arrays.toString(ch);

            if (map.containsKey(sortedString)) {

                map.get(sortedString).add(strs[i]);

            } else {

                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(sortedString, list);


            }


        }

        return new ArrayList<>(map.values());
    }
}
