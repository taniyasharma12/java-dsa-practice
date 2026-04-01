package Strings;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//https://leetcode.com/problems/longest-common-prefix/
		
		String[] strs = {"flowe","flow","fliwi"};
		//after sorting [clap, clove, club]

		System.out.println(longestCommonPrefix(strs));
		
	}
	
	public static String longestCommonPrefix(String [] strs) {
		

		Arrays.sort(strs);
		
		String first = strs[0];
		
		String last = strs[strs.length-1];
		
		int index =0;
		
		while(index<first.length() && index< last.length()) {
			
			
			if(first.charAt(index)==last.charAt(index)) {
				
				index++;
			}
			
			else {
				
				break;
			}
						
		}
		
		return first.substring(0, index);
		
		
		
		
	}
	
	

}
