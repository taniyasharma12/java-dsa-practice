package arrays;

import java.util.*;

public class GroupAnagram {

    public static void main(String args[]) {

        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.print(groupAnagrams(arr));


        // Output -> [[eat, tea, ate], [tan, nat], [bat]]
    }

    public static List<List<String>> groupAnagrams(String arr[]) {

        Map<String, List<String>> map = new LinkedHashMap<>();

        for (int i = 0; i < arr.length; i++) {

            char ch[] = arr[i].toCharArray();
            Arrays.sort(ch);
            String sortedWord = Arrays.toString(ch);

            if (!map.containsKey(sortedWord)) {
                ArrayList<String> list = new ArrayList<>();
                list.add(arr[i]);
                map.put(sortedWord, list);
            } else {
                map.get(sortedWord).add(arr[i]);
            }


        }
        return new ArrayList<>(map.values());

    }
}
