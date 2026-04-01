package strings;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CheckIfAStringIsAnAcronymofWords {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		
		String words []= {"never","gonna","give","up","on","you"};
		
		String s = "ngguop";
		
		System.out.println(isAcronym(words,s));
	}
	
	
	public static boolean isAcronym(String [] words, String s) {
		
		
		for(int i=0; i<words.length; i++) {
			
			String word = words[i];
			
			if(word.charAt(0)!=s.charAt(i)) {
				
				return false;
			}
		}
		
		return true;
	
}
/*
    
    String str = "";
    
    for(int i=0; i<words.length; i++) {
    
    str+= words[i].charAt(0);\
    }
    return s.equals(str);
    
    
    
    
    */
}
