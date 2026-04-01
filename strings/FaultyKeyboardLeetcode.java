package strings;

import java.util.Arrays;

public class FaultyKeyboardLeetcode {
//https://leetcode.com/problems/faulty-keyboard/description/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "string";
		
		/*
		 Input: s = "string"
         Output: "rtsng"
		 */
		
		System.out.println(solution(s));
	}

	public static String solution(String s) {
		
		String result = "";
		for(int i=0;i<s.length(); i++) {
			
			if(s.charAt(i)=='i') {
				
				//if i is found reverse from 0 to i
				// reverse the string typed so far
                result = swap(result, 0, result.length() - 1);
				
			}
			else {
				
				result+=s.charAt(i);
				
			}
			
		}
		return result;
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
