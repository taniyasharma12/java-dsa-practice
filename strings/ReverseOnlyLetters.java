package Strings;

public class ReverseOnlyLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "a-bC-dEf-ghIj";

		System.out.println(reverseOnlyLetters(s));
	}

	public static String reverseOnlyLetters(String s) {

		
		String rev = "";
		
		char arr[] = s.toCharArray();
		
        int left=0;
        int right =arr.length-1;
        
        while(left<=right) {
        	
        	while(left<right && isLetter(arr[left])==false) {
        		
        		left++;
        	
        	}
        	while(left<right && isLetter(arr[right])==false) {
        		
        		right--;
        	}
        	
        	swap(arr,left,right);
        	left++;
        	right--;
        	
        }
        	for(int i=0; i<arr.length; i++) {
        		
        		rev+=arr[i];
        	}
		
		return rev;
		
	}
	
	
	    public static void swap(char arr[], int left, int right) {
	    	
	    	char temp = ' ';
	    	
	    	temp=arr[left];
	    	arr[left]=arr[right];
	    	arr[right]=temp;
	    	
	    
	    	
	    }
		
	
	
	
		public static boolean isLetter(char ch) {
			
			if((ch>='a' && ch <='z') || (ch>='A' && ch<='Z')){
				
				
				return true;
				
				}
			
			return false;	
		}
				
	}
	

