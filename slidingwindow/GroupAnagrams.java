package slidingwindow;

import java.lang.reflect.Array;
import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {

        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};

        // Output -> [[eat, tea, ate], [tan, nat], [bat]]

        System.out.print(groupAnagrams(arr));

    }

    public static List<List<String>> groupAnagrams(String arr[]) {

        //store sorted string and its corresponding string in a list

        Map<String, List<String>> map = new LinkedHashMap<>();

        for (int i = 0; i < arr.length; i++) {

            char[] ch = arr[i].toCharArray();

            Arrays.sort(ch);

            String sortedWord = Arrays.toString(ch);

            if (map.containsKey(sortedWord)) {

                map.get(sortedWord).add(arr[i]);
            } else {

                List<String> list = new ArrayList<>();
                list.add(arr[i]);
                map.put(sortedWord, list);

            }

        }
        return new ArrayList<>(map.values());
    }
}
