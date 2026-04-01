package strings;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class HackerRankSherLockAndTheValidStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abcc";
		System.out.println(isValid(str));
		// https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem
	}

	/*
	 * 
	 * Sherlock considers a string to be valid if all characters of the string
	 * appear the same number of times. It is also valid if he can remove just one
	 * character at index in the string, and the remaining characters will occur the
	 * same number of times. Given a string , determine if it is valid. If so,
	 * return YES, otherwise return NO.
	 * 
	 */

	public static String isValid(String str) {

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {

			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);

		}

		int arr[] = new int[map.size()];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = map.get(i);

		}
		Arrays.sort(arr);

		int first = arr[0];
		
		int second = arr[1];
		
		int last = arr[arr.length-1];
		
		int secondLast = arr[arr.length-1];
		
		if(first==last) {
			
			return "YES";
		}
		if(first==1 && second==last) {
			return "YES";
		}
		if(first==secondLast && last==1) {
			
			return "YES";
		}
		return "No";
				

	}
}
