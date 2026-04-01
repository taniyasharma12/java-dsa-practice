package Strings;

public class GoalParserInterpretationLeetcode {

	public static void main (String args[]) {
		
		
		interpret("G()(al)");
	
}
	public static String interpret(String command) {
        //() o, (al) al
        String ans ="";

                   	   
        ans =  	   command.replace("(al)", "al");
        ans =	   ans.replace("()", "o");
        		   
           
return ans;
        }
    }

