package arrays.multidimensional;

public class SearchIn2DMatrix {

    public static void main(String[] args) {

        //https://www.youtube.com/watch?v=9ZbB397jU4k

        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 60;

        System.out.println(searchMatrix(matrix, target));

    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        //go in first row from last element to first and last column first row to last row

        int m = matrix.length; //total number of rows
        int n = matrix[0].length; //total number of columns
        int row = 0;
        int col = n - 1;

        while (row < m && col >= 0) {

            if (matrix[row][col] == target) {

                return true;

            } else if (matrix[row][col] > target) {
                col--;
            } else {

                row++;
            }

        }

        return false;
    }


}
