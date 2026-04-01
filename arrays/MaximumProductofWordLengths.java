package Arrays;

public class MaximumProductofWordLengths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String words[] = { "abcw", "baz", "foo", "bar", "xtfn", "abcdef" };

	}

	public int maxProduct(String[] words) {

		int max = 0;

        for (int i=0; i<words.length - 1; i++) {

            for (int j=i+1; j<words.length; j++) {

                if (checkUniqueness(words[i], words[j])) {

                    max = Math.max(max, words[i].length() * words[j].length());

                }
            }	
	}
        return max;
        
	}
		
	
	
	public static boolean checkUniqueness(String s1, String s2) {
		
		char count[] = new char[26];
		
		for(char c : s1.toCharArray()) {
			
			count[c-'a']++;
		}
		
		for(char c: s2.toCharArray()) {
			
			if(count[c-'a']>0) {
				
				return false;
			}
		
	}
		return true;
	
	}
}