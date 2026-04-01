package maps;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class IceCreamParlour {

    public static void main(String[] args) {


        int nums[] = {1, 3, 4, 5, 6};

        int m = 6;

    }

    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {

        Map<Integer, Integer> map = new LinkedHashMap<>();

        int complement = 0;

        for (int i = 0; i < arr.size(); i++) {

            complement = m - arr.get(i);

            if (map.containsKey(complement)) {

                return Arrays.asList(map.get(complement) + 1, i + 1);
            } else {

                map.put(arr.get(i), i);
            }
        }

        return null;

    }

}

