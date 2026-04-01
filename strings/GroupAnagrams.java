package strings.frequencyCounting;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {


        String strs[] = {"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println(groupAnagrams(strs));

    }


    public static List<List<String>> groupAnagrams(String strs[]) {

        //create a hashmap with the sorted string as key and matching strings as values

        Map<String, List<String>> map = new LinkedHashMap<>();

        for (int i = 0; i < strs.length; i++) {

            char[] str = strs[i].toCharArray();
            Arrays.sort(str);
            String sortedWord = Arrays.toString(str);

            if (map.containsKey(sortedWord)) {

                map.get(sortedWord).add(strs[i]);
            } else {

                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(sortedWord, list);

            }
        }
        return new ArrayList<>(map.values());

    }


}
