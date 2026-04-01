package arrays.multidimensional;

public class RotateMatrixBy90Degree {

    public static void main(String[] args) {

        int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        rotate(matrix);
    }


    public static void rotate(int[][] matrix) {

        //take transpose , transpose means i becomes j , j becomes i

        for (int i = 0; i < matrix.length; i++) {

            for (int j = i + 1; j < matrix[i].length; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //reverse each row

        for (int i = 0; i < matrix.length; i++) {

            int left = 0;
            int right = matrix.length - 1;

            while (left < right) {


                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }

        for (int rows[] : matrix) {

            for (int element : rows) {

                System.out.print(element + " ");
            }

            System.out.println();

        }
    }
}
