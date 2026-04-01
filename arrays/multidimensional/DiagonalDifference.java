package arrays.multidimensional;

public class DiagonalDifference {

    public static void main(String[] args) {

        int n = 3;
        int m = 3;
        int matrix[][] = {{11, 2, 4}, {4, 5, 6}, {10, 8, -12}};

        /*
        11 2  4
        4  5  6
        10 8 -12
         */
        solution1(matrix);
        System.out.println("****************************************************");
        solution2(matrix);


    }

    //left diagonal indices when i=j
    //right diagonal indices when i+j = n-1


    public static void solution1(int matrix[][]) {

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (i == j) {

                    leftSum += matrix[i][j];
                }
                if (i + j == matrix.length - 1) {
                    rightSum += matrix[i][j];
                }
            }
        }

        System.out.println(leftSum);
        System.out.println(rightSum);
        System.out.println(Math.abs(leftSum - rightSum));

    }


    public static void solution2(int matrix[][]) {

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < matrix.length; i++) {

            leftSum += matrix[i][i];

            rightSum += matrix[i][matrix.length - i - 1];              // i+j = n-1 // j = n-i-1


        }
        System.out.println(leftSum);
        System.out.println(rightSum);
        System.out.println(Math.abs(leftSum - rightSum));
    }
}
