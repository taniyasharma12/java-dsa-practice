package arrays;

/**
 * @author TaniyaSharma
 *
 */
public class PrintSecondMinimumAndSecondMaximumElement {

	public static void main(String[] args) {

		
		int arr[] = {22,45,12,-10,-2,55,54};
		
		//System.out.println(findSecondMax(arr));
		
		System.out.println(findSecondMin(arr));
	}

	
	
	
	public static int findSecondMax(int arr[]) {
		
		int max =0;
		int secondMax =0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				
				max=arr[i];
			}
		}
		for(int j=0; j<arr.length; j++) {
			if(arr[j]>secondMax && arr[j]!=max) {
					
					secondMax=arr[j];
				}
		}
		return secondMax;
	}
	
	
	
	
    public static int findSecondMin(int arr[]) {
		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]<min) {
				
				min=arr[i];
			}
		}
		for(int j=0; j<arr.length; j++) {
		
		if(arr[j]<secondMin && arr[j]!=min ) {
			
			secondMin = arr[j];
		}
	}
    return secondMin;
}

}
