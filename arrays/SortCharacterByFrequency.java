package arrays;

import java.util.*;

public class SortCharactersByFrequency {

    public static void main(String[] args) {

        String str = "tree";

        System.out.println(frequencySort(str));
        //output - > "eert"

    }

    //store characters and frequency in a HashMap
    //store the map in a list and sort it based on values
    //add the keys in a new empty string in same order

    public static String frequencySort(String str) {

        String result = "";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        //Only keys needed → map.keySet()
        //Keys + values needed → map.entrySet()

        List<Character> list = new ArrayList<>(map.keySet());
        System.out.println(list);
        System.out.println("********************");


        // Collections.sort(list);
        Collections.sort(list, (e1, e2) -> {
            return map.get(e2) - map.get(e1);
        });
        System.out.println(list);

        for (Character ch : list) {
            int frequency = map.get(ch);
            for (int i = 0; i < frequency; i++) {
                result += ch;
            }
        }

        return result;
    }
}
