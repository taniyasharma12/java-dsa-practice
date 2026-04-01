package strings;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExtractDistinctWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Input  : Java is great.Python is also great.
		
		String str = "Java is great Python is also great also also great ";
		
		//create an array out of string, put array in a hashset and print
		
		Set<String> set = new LinkedHashSet<>();
		
			String [] words = str.split(" ");
			
			for(int i =0; i<words.length; i++) {

			
			set.add(words[i]);
			
		}
			
			System.out.println(set);
			
			Iterator<String> it = set.iterator();
			
			while(it.hasNext()) {
				
				System.out.println(it.next());
			}
	}
}
