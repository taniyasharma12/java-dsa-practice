package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortCharactersByFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "tree";

		System.out.println(frequencySort(s));
	}

	public static String frequencySort(String s) {

		String result = "";
		Map<Character, Integer> map = new LinkedHashMap<>();
		
        for(int i=0; i<s.length(); i++) {
	
	       map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        
        }


        char[] arr = s.toCharArray();
        
        List<Character> lst = new ArrayList(map.keySet());
        
        Collections.sort(lst, (a,b)-> map.get(b)-map.get(a));
        
        for(int i=0; i<lst.size(); i++) {
        	for(int j=0; j<map.get(lst.get(i)); j++) {
        	result+=lst.get(i);
        }
        }
	return result;
}
}
/*


char count[] = new char[26];

for (int i = 0; i < s.length(); i++) {

	count[s.charAt(i) - 'a']++;

}

*/
