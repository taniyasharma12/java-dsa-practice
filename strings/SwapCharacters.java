/**
 * 
 */
package Strings;

/**
 * @author TaniyaSharma
 *
 */
public class SwapCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(swap("abcde",0,4));

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
