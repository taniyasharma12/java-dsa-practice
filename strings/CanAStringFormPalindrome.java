package strings;

public class CanAStringFormPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(canFormPalindrome("madam"));
	
	} 

	public static boolean canFormPalindrome(String str) {
		
		char  char_count[] = new char[26];
		
		int count =0;
		
		
		for(int i=0; i<str.length(); i++) {
			
			char_count[str.charAt(i)-'a']++;
			System.out.println(str.charAt(i)-'a');
		}
		
		for(int i=0; i<26; i++) {
			
			count+=char_count[i]%2;
		}
		
		if(count>1) {
			
			return false; 
		}
		
		return true;

	}
}
/*
A string can form a palindrome if at most one character has an odd frequency.

Even-length palindrome → all counts even.

Odd-length palindrome → exactly one odd count allowed.
 
 */
