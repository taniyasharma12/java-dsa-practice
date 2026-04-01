package strings;

public class FirstLettertoAppearTwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(repeatedCharacter("eesll"));
	}

	public static char repeatedCharacter(String s) {

		//create an empty array of 128 characters and 
		//store character count of each character present in String
		//now check which element in array has value greater than 2 and print
		
		int char_count[] = new int[128];
		
		for(int i=0; i<s.length(); i++) {
			
			char_count[s.charAt(i)]++;
			
		}
		
		char ans = ' ';
		for(int i=0; i<s.length(); i++) {			
			if(char_count[s.charAt(i)]>=2) {
				
				ans = s.charAt(i);
			}
			
		}
		
		return ans;
		
		
	}
}
