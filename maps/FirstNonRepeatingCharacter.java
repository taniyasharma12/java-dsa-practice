package maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String str = "swiss";

        System.out.println(firstNonRepeatingCharacter(str));
    }

    //Time complexity is O(n)
    //Space complexity is O(k)

    public static char firstNonRepeatingCharacter(String str) {


        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {

            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);

        }

        for (Map.Entry<Character, Integer> element : map.entrySet()) {

            if (element.getValue() == 1) {

                return element.getKey();
            }

        }

        return 0;
    }
}
