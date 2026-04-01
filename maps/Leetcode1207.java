package maps;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Leetcode1207 {

    public static void main(String[] args) {

        int arr[] = {1, 2, 2, 1, 1, 3};

    }

    //Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Integer> numberOfOccurances = new LinkedHashMap<>();

        for (int i = 0; i < arr.length; i++) {

            numberOfOccurances.put(arr[i], numberOfOccurances.getOrDefault(arr[i], 0) + 1);

        }

        Set<Integer> uniqueElements = new LinkedHashSet<>();

        for (int num : arr) {

            uniqueElements.add(numberOfOccurances.get(num));

        }

        if(uniqueElements.size()==numberOfOccurances.size()){

            return true;
    }

            return false;
                    }
                    }


