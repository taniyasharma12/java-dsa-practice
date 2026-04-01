package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToTimeFrame {

	
	public static void main(String[] args) {

		int [] arr = {3,6,2,2,5,5};
		// Output 235652
		//format -> 23:59:59
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		for(int i=0; i<arr.length; i++) {
			
			list.add(arr[i]);
		}
		int h2= nearestSmallestOrEqualTo(list, 2);
		int h1= nearestSmallestOrEqualTo(list, 2);
		if(h1==1 || h1==0) {
		
		h2=nearestSmallestOrEqualTo(list, 9);
		}
		else {
			
			h2= nearestSmallestOrEqualTo(list, 4);
	
		}
		int m1= nearestSmallestOrEqualTo(list, 5);
		int m2= nearestSmallestOrEqualTo(list, 9);
		int s1= nearestSmallestOrEqualTo(list, 5);
		int s2= nearestSmallestOrEqualTo(list, 9);

		ArrayList<Integer> result = new ArrayList<Integer>();
		
		result.add(h1);
		result.add(h2);
		result.add(m1);
		result.add(m2);
		result.add(s1);
		result.add(s2);
		
		System.out.print(result);
	}

	
	
	public static int nearestSmallestOrEqualTo(List<Integer> list , int target) {
		 
		int nearest = 0;
		
		for(int i=0; i<list.size(); i++) {
			
			if(list.get(i)<=target) {
				
				nearest = Math.max(list.get(i), nearest);
			}
		}
		
		for(int i=0; i<list.size(); i++) {
			
			if(list.get(i)==nearest) {
				
				list.remove(i);
			}
		}
		
		return nearest;

		
	}
}

