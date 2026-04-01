package arrays.multidimensional;

public class TransposeOfAMatrix {

    public static void main(String[] args) {

        int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        transpose(matrix);

/*
123
456
789

Transpose
147
258
369
 */

    }

    public static int[][] transpose(int matrix[][]) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = i + 1; j < matrix[i].length; j++) {  //i+1 to avoid duplicate comparisons, 0 to i+1 includes upper triangle only

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }
        }

        for (int rows[] : matrix) {

            for (int element : rows) {

                System.out.print(element + " ");
            }

            System.out.println();
        }
        return matrix;
    }


}
