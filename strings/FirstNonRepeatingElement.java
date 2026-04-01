package strings;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "xeetcotdext";
		
		System.out.println(firstUniqChar(str));
		
	}
	
	public static int firstUniqChar(String s) {

		
		char ans = ' ';
		int index=0;
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for(int i=0; i<s.length(); i++) {
			
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
		}
		
		for(Character ch : map.keySet()) {
			
			if(map.get(ch)==1) {
				
				ans = ch;
				break;
			}
		}
		
		for(int i=0; i<s.length(); i++) {
			
			if(s.charAt(i)==ans) {
				
				index=i;
				break;
			}
		}
		return index;
	}
}
