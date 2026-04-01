package maps;

import java.util.ArrayList;
import java.util.List;

public class CommonCharactersInStringArrays {

    public static void main(String[] args) {

        String [] words = {"bella","label","roller"};

        System.out.println(solution(words));

    }

    public static List<String> solution(String words []) {


       int[] minFreq = new int[26];

       for(int i=0; i<words[0].length(); i++) {

           minFreq[words[0].charAt(i)-'a']++;

       }

       for(int i=1; i<words.length; i++) {

           int[] freq = new int[26];

           for (Character ch : words[i].toCharArray()) {


               freq[ch - 'a']++;

           }

           for (int j = 0; j < 26; j++) {

               minFreq[j] = Math.min(minFreq[j], freq[j]);

           }
       }
           List<String> result = new ArrayList<>();
           for (int i = 0; i < 26; i++) {
               while (minFreq[i]> 0) {
                   result.add("" + (char) (i + 'a'));
                   minFreq[i]--;
               }
           }

           return result;
       }
    }

    /*

    class Solution {
    public List<String> commonChars(String[] words) {

        store the the Character and Frequency of the first word in a map
        create a temporary map and and store the Character and frequency of other Strings
        now if the tempMap does not contain the character then remove the character from main map
        and if it contains then the max of the 2 map value will become map value
        After that create a list of map key and values




    Map<Character,Integer> map = new LinkedHashMap<>();

        for(int i=0; i<words[0].length(); i++){

        map.put(words[0].charAt(i), map.getOrDefault(words[0].charAt(i),0)+1);

        }


        for(int i=1; i<words.length; i++) {

        Map<Character, Integer> tempMap = new LinkedHashMap<>();

        for(int j=0; j<words[i].length(); j++) {

        tempMap.put(words[i].charAt(j), tempMap.getOrDefault(words[i].charAt(j),0)+1);

        }

        for(Character ch : map.keySet()) {

        if(!tempMap.containsKey(ch)){

        map.put(ch,0);
        }
        else{
        map.put(ch, Math.min(map.get(ch), tempMap.get(ch)));

        }
        }

        }
        List<String> list = new ArrayList<>();

        for(Character ch : map.keySet()){

        int count = map.get(ch);

        while(count>0) {

        list.add(ch+"");
        count--;


        }



        }
        return list;

        }




        }
        */