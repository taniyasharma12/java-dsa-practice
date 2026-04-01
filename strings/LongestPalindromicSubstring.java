package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(longestPalindrome("babad"));
	}

	public static String longestPalindrome(String s) {

		int max = 0;
		int startIndex = 0;
		int endIndex = 0;
		String ans = "";
		if (s.length() == 1) {

			return s;

		}

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {

				if (isPalindrome(s.substring(i, j))) {

					if (s.substring(i, j).length() > max) {
						max = s.substring(i, j).length();
						startIndex = i;
						endIndex = j;
					}
				}
			}

		}
		return s.substring(startIndex, endIndex);
        
	}

	public static boolean isPalindrome(String s) {

		int i = 0;
		int j = s.length() - 1;

		while (j > 0) {

			if (s.charAt(i) != s.charAt(j)) {

				return false;
			}

			i++;
			j--;
		}
		return true;
	}
}
