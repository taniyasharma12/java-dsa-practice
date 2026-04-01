package strings;

public class BuddyStringsLeetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
Given two strings s and goal, return true if you can swap two letters in s so the result is equal to goal, otherwise, return false.

Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at s[i] and s[j].

For example, swapping at indices 0 and 2 in "abcd" results in "cbad".
 

Example 1:

Input: s = "ab", goal = "ba"
Output: true
Explanation: You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is equal to goal.
		 */
		String s = "abc";
		String goal ="bad";
		
		System.out.println(buddyStrings(s, goal));
		
		
	}
	
	public static boolean buddyStrings(String s, String goal) {
		
		//1. if length is not same for both string return false
		
		if(s.length()!=goal.length()) {
			
			return false;
			
		}
		
		//2. if two strings are equal , we need to check ig any one character is duplicated then return true
		
		
		char[] freq = new char[26];
		
		for(int i=0; i<s.length(); i++) {
			
			freq[s.charAt(i)-'a']++;
			
			if(freq[s.charAt(i)-'a']>2) {
				
				return true;
			}
			
		}
		
		//3. if a and goal are not equal then check there are exactly 2 mismatched characters
		
		
		int first =0; //to store first mismatched index
		int second=0; //to store second mismatched index
		int count = 0; //store total number of mismatched indices
		
		for(int i=0; i<s.length(); i++) {
			
			if(s.charAt(i)!=goal.charAt(i)) {
				
				count++;
				
				if(count==1) {
					
					first =i;
				}
				else if (count==2) {
					
					second=i;
				}
			}
			
			swap(s,first, second);
			return s.equals(goal);
		}
		return false;
	}
		
		
		
		
public static String swap(String s, int i, int j) {
		
		
		String result ="";
				
		char str[] = s.toCharArray();
	
		while(i<j) {
			
			char temp = str[i];
			str[i]= str[j];
			str[j]= temp;
			i++;
			j--;
		
		}
		
		for(int k=0; k<s.length(); k++) {
			
			result+=str[k];
		}
		
		
		
		return result;
		
		
		
	}

}
