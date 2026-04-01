package searching;

public class LinearSearch {


    public static void main(String[] args) {

        int nums[] = {1, 2, 3, 4};

        int target = 3;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {

                System.out.println(i);
            }
        }
    }


}
