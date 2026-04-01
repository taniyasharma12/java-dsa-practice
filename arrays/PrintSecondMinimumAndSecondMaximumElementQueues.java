package Arrays;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @author TaniyaSharma
 *
 */
public class PrintSecondMinimumAndSecondMaximumElementQueues {

	
	public static void main(String[] args) {

		int arr[] = {22,45,12,-10,-2,55,54};

		
		System.out.println(returnSecondMax(arr));
		System.out.println(returnSecondMin(arr));

	}

	
	
	
	
	
	
	
	public static int returnSecondMax(int arr[]) {
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		
		int k=2;
		
		for(int i=0; i<k; i++) {
			
			queue.add(arr[i]);
		}
		
		for(int i=k; i<arr.length; i++) {
			
			if(arr[i]>queue.peek()) {
				
				queue.remove();
				queue.add(arr[i]);
			}
		}
		return queue.peek();
	}
	
public static int returnSecondMin(int arr[]) {
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		
		int k=2;
		
		for(int i=0; i<k; i++) {
			
			queue.add(arr[i]);
		}
		
		for(int i=k; i<arr.length; i++) {
			
			if(arr[i]<queue.peek()) {
				
				queue.remove();
				queue.add(arr[i]);
			}
		}
		return queue.peek();
	}
	
	
	
}

