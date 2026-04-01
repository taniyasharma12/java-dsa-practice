package arrays;
public class CanPlaceFlowers {

	public static void main(String[] args) {
int nums[] = {0,0,1,0,1};
int n=1;
System.out.println(canPlaceFlowers(nums,n));


	}
public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        
	int count=0;

    if(flowerbed.length==1) {
    	
    	if(flowerbed[0]==0) {
         return true;
    	}
    	if(flowerbed[0]==1) {
            return n<=0?true:false;
       	}
    }
    
    if(flowerbed[0]==0 && flowerbed[1]==0){

        flowerbed[0]=1;
        count++;

    }
    if(flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0){

        flowerbed[flowerbed.length-1]=1;
        count++;

    }
    for(int i=1; i<flowerbed.length; i++) {
    	
    	if(flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0) {
    		
    		flowerbed[i]=1;
    		count++;
    	}
    }
    
    return n>count?false:true;
}
}
