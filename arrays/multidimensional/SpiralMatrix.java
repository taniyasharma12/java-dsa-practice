package arrays.multidimensional;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static void main(String[] args) {


        int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(spiralOrder(matrix));

    }

    public static List<Integer> spiralOrder(int[][] matrix) {

        int top = 0;
        int right = matrix[0].length - 1;
        int left = 0;
        int bottom = matrix.length - 1;


        List<Integer> list = new ArrayList<Integer>();


        while (top <= bottom && left <= right) {

            //left to right

            for (int j = left; j <= right; j++) {

                list.add(matrix[top][j]); //left is the column boundary, while top is the row boundary
            }
            top++;


            //top to bottom

            for (int i = top; i <= bottom; i++) {

                list.add(matrix[i][right]);
            }

            right--;


            //right to left
            if (top <= bottom) {


                for (int j = right; j >= left; j--) {

                    list.add(matrix[bottom][j]);
                }
                bottom--;

            }


            //bottom to top

            if (left <= right) {

                for (int i = bottom; i >= top; i--) {

                    list.add(matrix[i][left]);

                }
                left++;
            }

        }
        return list;

    }
}
