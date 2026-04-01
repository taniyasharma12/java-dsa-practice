package Strings;

public class RotateStringLeetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "abcde"; 
		String goal = "cdeab";
		
		System.out.println(rotateString(s,goal));
		
	}

	public static boolean rotateString(String str, String goal) {

		
		
		for(int i=0; i<str.length(); i++) {
			
			if(rotate(i,str).equals(goal)) {
				
				return true;
			}
		}
		return false;
	}

		public static String reverse(String str, int start, int end) {
			
			char[] c = str.toCharArray();
			
			while(start<end) {
				
				char temp = c[start];
				
				c[start] = c[end];
				
				c[end] = temp;
				
				start++;
				end--;	
			}
			
			String rev="";
			
			for(char ch : c) {
				
				rev+=ch;
			}
			return rev;
		}

		
		public static String rotate(int k, String str) {
			
			str=reverse(str,0,k);
			
			str=reverse(str, k+1, str.length()-1);
			
			str=reverse(str, 0, str.length()-1);
			
			return str;
		}

	}
		
//		int i=0;
//		
//		while(i<s.length()) {
//			
//			if(s.equals(goal)) {
//				
//				return true;
//			}
//			s = s.substring(1) + s.charAt(0);
//			i++;
//		}
//		return false;
//	}
//}
