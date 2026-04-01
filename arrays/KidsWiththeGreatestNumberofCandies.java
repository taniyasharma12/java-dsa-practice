package Arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {

	public static void main(String[] args) {

		int[] candies = { 2, 3, 5, 1, 3 };
		int extraCandies = 3;

		System.out.print(kidsWithCandies(candies,extraCandies));

	}

	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

		int sumi =0;
		
		List<Boolean> list = new ArrayList<Boolean>();

		for (int i = 0; i < candies.length; i++) {

			sumi = candies[i] + extraCandies;
			
			if(isGreatestAmong(candies,sumi)) {
				
				list.add(true);
			}
			else {
				
				list.add(false);
			}

		}
		return list;
	}

	public static boolean isGreatestAmong(int nums[], int num) {

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] > num) {
				return false;

			}
		}
		return true;
	}
}