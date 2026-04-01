package maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MostRecurringCharacter {
    public static void main(String[] args) {

        String str = "swisstttttttt";

        System.out.println(mostRecurringCharacter(str));
    }

    //Time complexity is O(n)
    //Space complexity is O(k)

    public static char mostRecurringCharacter(String str) {


        Map<Character, Integer> map = new LinkedHashMap<>();

        int max = Integer.MIN_VALUE;

        char ch = 0;

        for (int i = 0; i < str.length(); i++) {

            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);

        }

        for (Map.Entry<Character, Integer> element : map.entrySet()) {

            if(element.getValue()>max) {
                max = element.getValue();
                ch = element.getKey();

            }
        }

        return ch;
    }
}
