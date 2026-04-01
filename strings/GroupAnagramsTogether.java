package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagramsTogether {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = { "eat", "tea", "tan", "ate", "nat", "bat" };

		System.out.print(groupAnagrams(arr));

	}

	public static List<List<String>> groupAnagrams(String arr []){
/*
Function should return List of List in output
Create a hashmap of String and List
extract string from string array and convert to array and sort it and convert to string
create entry in hashmap for sorted string and its word if not present
if key is present just add word to list
 */
		Map<String, List<String>> map = new LinkedHashMap<>();
	
		for(int i=0; i<arr.length; i++) {
			
			char[] ch = arr[i].toCharArray();
			
			 Arrays.sort(ch);
			
		     String	sortedWord = Arrays.toString(ch);
			
		   if(!map.containsKey(sortedWord))  {
			   
			   ArrayList<String> list = new ArrayList<String>();
			   
			   list.add(arr[i]);
			   
			 map.put(sortedWord, list);			   
		   }
		   else {
			   
			   map.get(sortedWord).add(arr[i]);
		   }
		}
	return new ArrayList<>(map.values());

}
}
