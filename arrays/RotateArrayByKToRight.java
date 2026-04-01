package arrays;

public class RotateArrayByKToRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,4,5,6,7}; //5 1 2 3 4 ... 4 5 1 2 3 .. 3 4 5 1 2
		int n =arr.length;

		int k = 3;
		
		k= k%n;
		reverse(0, n-1, arr);
		reverse(0, k-1, arr);
		reverse(k, n-1, arr);
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		
		
		
	}
	
	
	public static void reverse(int start, int end , int nums[]) {
		
		
		int temp =0;
       
		while(start<end) {
			
			temp = nums[start];
			nums[start]=nums[end];
			nums[end]=temp;		
			start++;
			end--;
		}
	}

}
