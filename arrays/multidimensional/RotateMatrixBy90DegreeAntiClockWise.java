package arrays.multidimensional;

public class RotateMatrixBy90DegreeAntiClockWise {

    public static void main(String[] args) {

        int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        rotateAntiClockwise(matrix);

    }

    /*
    123
    456
    789

    take transpose
    147
    258
    369

    reverse each column
    369
    258
    147
    */

    public static void rotateAntiClockwise(int[][] matrix) {

        //transpose

        for (int i = 0; i < matrix.length; i++) {

            for (int j = i + 1; j < matrix[i].length; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //reverse column

        for (int i = 0; i < matrix[0].length; i++) {

            int left = 0;
            int right = matrix[i].length - 1;

            while (left < right) {

                int temp = matrix[left][i];
                matrix[left][i] = matrix[right][i];
                matrix[right][i] = temp;
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
