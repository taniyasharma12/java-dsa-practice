package Arrays;

import java.util.ArrayList;
import java.util.List;

public class LeetCode949 {

	
	
	
	public static void main(String args[]) {
		
		int [] arr = {5,5,5,5};
		
		System.out.println(largestTimeFromDigits(arr));
		
	}
		
		public static  String largestTimeFromDigits(int[] arr) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			
			list.add(arr[i]);
		}
		int h1= nearestSmallestOrEqualTo(list, 2);
		int h2;
		if(h1==1 || h1==0) {
		
		h2=nearestSmallestOrEqualTo(list, 9);
		}
		else {
			
		h2= nearestSmallestOrEqualTo(list, 3);
	
		}
		int m1= nearestSmallestOrEqualTo(list, 5);
		int m2= nearestSmallestOrEqualTo(list, 9);

		System.out.println(h1);
		System.out.println(h2);

		System.out.println(m1);

		System.out.println(m2);

		
		String answer = String.valueOf(h1)+h2+":"+m1+m2;
		if(answer==null)
			return "";
		
		else
		return answer;
    
		}
		
	public static int nearestSmallestOrEqualTo(List<Integer> list , int target) {
		 
		int nearest = 0;
		
		for(int i=0; i<list.size(); i++) {
			
			if(list.get(i)<=target) {
				
				nearest = Math.max(list.get(i), nearest);
			}
		}
		
		System.out.println("Java" == "Java"); 
		for(int i=0; i<list.size(); i++) {
			
			if(list.get(i)==nearest) {
				
				list.remove(i);
			}
		}
		if (nearest==0){
			return (Integer) null;
		}
		else {
		return nearest;
		}
		
	}
}




