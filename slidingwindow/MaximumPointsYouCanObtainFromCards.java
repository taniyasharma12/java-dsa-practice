package slidingwindow;

public class MaximumPointsYouCanObtainFromCards {

    public static void main(String[] args) {


        int[] cardPoints = {1, 2, 3, 4, 5, 6, 1};

        int k = 3;

        System.out.println(maxScore(cardPoints, 3));
        /*
        FIRST ITERATION
        leftSum = 1+2+3 => 6
        maxSum=>6
        rightSum => 1
        leftSum = 1+2+3-1=> 5
        maxSum = (maxSum, leftSum + rightSum) => (6,6); maxSum = 6;
        SECOND ITERATION
        leftSum = 2+3 => 5
        maxSum => 6
        rightSum => 7
        leftSum = 2+3-2 => 3
        maxSum = (maxSum, leftSum + rightSum) => (6,10); maxSum = 10;
        THIRD ITERATION
        leftSum => 3
        maxSum => 10
        rightSum => 12
        leftSum = 3-3 =>0
        maxSum = (maxSum, leftSum + rightSum) => (10,12); maxSum = 12;

        */

        /*
        1. Take two variables leftSum and rightSum as 0
        2. Take sum of first k elements as leftSum
        3. assign value of leftSum to maxSum
        4. take another pointer j which points at last element
        5. iterate loop from 0 to k
        6. one by one remove left element from leftSum and add right most element to rightSum
        7. take max value of maxSum and leftSum + rightSum;
 */


    }


    public static int maxScore(int cardPoints[], int k) {

        int leftSum = 0;
        int rightSum = 0;
        int maxSum = 0;

        for (int i = 0; i < k; i++) {

            leftSum += cardPoints[i];

        }

        maxSum = leftSum;

        int j = cardPoints.length - 1;

        for (int i = 0; i < k; i++) {

            leftSum = leftSum - cardPoints[i];
            rightSum += cardPoints[j];
            j--;
            maxSum = Math.max(leftSum + rightSum, maxSum);

        }

        return maxSum;
    }
}
