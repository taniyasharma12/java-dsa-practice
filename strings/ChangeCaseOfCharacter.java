package strings;

import java.lang.reflect.Array;

public class ChangeCaseOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "HeLLo";
		System.out.println(changeCase(str));

	}

	
	public static String changeCase(String str) {
		
		char ch[] = str.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
					
		if(ch[i]>='a'&& ch[i] <= 'z')
		{
			ch[i] = (char) ('A' + ch[i] - 'a');
		}
		else if(ch[i]>='A'&& ch[i] <= 'Z')
		{
			ch[i] = (char) ('a' + ch[i] - 'A');  // ch-A = down - a
		}
		}
		
		String ans ="";
		
		for(int i=0; i<ch.length; i++) {
			
			ans+=ch[i];
		}
		return ans;
				
	}
}
