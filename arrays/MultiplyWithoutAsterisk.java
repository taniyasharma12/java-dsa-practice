package arrays;

public class MultiplyWithoutAsterisk {


    public static void main(String[] args) {

        int[] arr = {2, 3, 4};

        System.out.println(solution(arr));

    }

    public static int multiplyTwoNumbers(int a, int b) {

        int result = 0;

        for (int i = 0; i < b; i++) {

            result += a;
        }

        return result;

    }

    public static int solution(int arr[]) {

        int result = 1;

        for (int i = 0; i < arr.length; i++) {

            result = multiplyTwoNumbers(result, arr[i]);
        }

        /*
        2, 3, 4
        result => 1
        result => 1*2 = 2
        result => 2*3 = 6
        result => 6*4 = 24


         */
        return result;
    }
}

/*

2, 3, 4

result = 1,2 => 2
result = 2,3 => 6
result = 6,4 => 24


 */
