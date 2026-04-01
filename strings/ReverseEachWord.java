package strings;

public class ReverseEachWord {

	public static void main(String [] args) {
		
		String str = "Let's take LeetCode contest";
		
		System.out.println(reverse(str));
	
	}
	
	 public static String reverse(String str) {
		
		String result ="";
				
		String words[] = str.split(" ");
		
		for(int i=0; i<words.length; i++) {
			
			String revWord="";

			String word = words[i];
			
		for(int j=word.length()-1; j>=0; j--) {
			
			revWord+=word.charAt(j);
			
		}	
		result += revWord+ " ";	

		}

		return result;
	}
}
