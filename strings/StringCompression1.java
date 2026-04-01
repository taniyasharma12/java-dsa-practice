package strings;

public class StringCompression1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = ""
				+ "";
		
		
		System.out.println(compressString1(str));
				//ouptut - a4h3c2d3a2e2f1 
		
	}
	
	public static String compressString1(String str) {
		
		String result =str.charAt(0)+"";
		int count =1;

		for(int i=1; i< str.length(); i++) {
			
		char previous = str.charAt(i-1);
		
		char current = str.charAt(i);
		
		if(previous==current) {
			count++;
		}
		else {
			result+=count;

			result+=current;
			count=1;
			
		}
	}
		result+=count;
	
		return result;
	}
}
