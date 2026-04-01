package Strings;

public class FindMostRecurringCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aaabbbbbbbbyy";
		
		int max = Integer.MIN_VALUE;
		
		int max_index = 0;

		// create an empty array

		int char_count[] = new int[26];
		
		for(int i=0; i<str.length(); i++) {
			
			char_count[str.charAt(i)-'a']++;
			
		}

		for(int i=0; i<26;i++) {
			
				if(char_count[i]>max) {
					max = char_count[i];
					max_index=i;

				}			
		}
		System.out.println(max + " " + (char)(max_index+'a'));
	}
}