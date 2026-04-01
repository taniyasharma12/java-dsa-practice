package Strings;

import java.util.ArrayList;
import java.util.List;

public class GroupAnagramsBruteForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println(isAnagram("listen", "silenj"));
		
		
	}
	public static List<List<String>> groupAnagrams(String s1, String s2){
		
		
		String strs [] = {"eat","tea","tan","ate","nat","bat"};
		
		for(int i=0; i<strs.length; i++) {
			
			for(int j=0; j<strs.length; j++) {
				
				if(isAnagram(strs[i], strs[j])){
					
					ArrayList<String> list = new ArrayList<String>();
                          
					list.add(strs[i]);
					list.add(strs[j]);
				}
			}
		}
		return null;
		
		
		//System.out.println(list);
	}

	
	
	
	
	
	
	
	public static boolean isAnagram(String s1, String s2) {
		
		if(s1.length()!=s2.length()) {
			
			return false;
		}
		int count [] = new int[128];
		for(int i=0; i<s1.length(); i++) {
			
			count[s1.charAt(i)]++;
		}
        for(int i=0; i<s2.length(); i++) {
			
			count[s2.charAt(i)]--;
		}
        
        for(int i=0; i<128; i++) {
        	
        	if(count[i]!=0) {
        		return false;
        	}
        }
        
        return true;
	}
}

