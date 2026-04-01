package Strings;

public class LongPressedName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
		
		String name = "saeed";
		String typed = "ssaaedd";
		
		System.out.println(isLongPressedName(name,typed));
		
	}
	
	public static boolean isLongPressedName(String name, String typed) {

       if(name.length()>typed.length()) {
    	   
    	   return false;
       }
		
	int i=0; 
	int j=0;
	
	while(i<name.length() && j<typed.length()) {
		
		if(name.charAt(i)==typed.charAt(j)) {
			
			i++;
			j++;
			
		}
		
		else if(i>0 && name.charAt(i-1)==typed.charAt(j)) {
			
			j++;
			
			//ex name = "saeed"; typed = "ssaaedd";
			 
		}
		
		else {
			
			return false;
		}
	}
		// ex - aabbc  and aabbccd
		
		while(j<typed.length()) {
			
			if(name.charAt(i-1)==typed.charAt(j)) {
				
				j++;
			}
			else {
				return false;
			}
		}
	
		
		return i<name.length()?false:true;
		
		// ex - aabbcc  and  aaabbb
		
		
		
		
		
	}
		
}
 