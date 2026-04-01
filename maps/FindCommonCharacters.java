package maps;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FindCommonCharacters {

    public static void main(String[] args) {

        String words[] = {"ccool", "loocck", "ccook"};
        System.out.println(commonChars(words));

    }


    public static List<String> commonChars(String words[]) {


        //create a hashmap and store characters and frequency of first word

        Map<Character,Integer> map = new LinkedHashMap<>();
          char [] first = words[0].toCharArray();
           for(int i=0; i<first.length; i++){

               map.put(first[i], map.getOrDefault(first[i],0)+1);

           }

           for(int i=1; i<words.length; i++) {

               Map<Character, Integer> tempMap = new LinkedHashMap<>();

               for (Character ch : words[i].toCharArray()) {

                   tempMap.put(ch, tempMap.getOrDefault(ch, 0) + 1);

               }

               for (Character ch : map.keySet()) {

                   if (!tempMap.containsKey(ch)) {

                       map.put(ch, 0);
                   } else {

                       map.put(ch, Math.min(map.get(ch), tempMap.get(ch)));
                   }

               }
           }

        List<String> list = new ArrayList<String>();

       for(Character ch : map.keySet()) {

           int count = map.get(ch);

           while(count>0){

               list.add(String.valueOf(ch));
               count--;
           }


        }


        return list;
    }
}

