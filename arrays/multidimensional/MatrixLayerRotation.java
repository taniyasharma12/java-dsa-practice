package arrays.multidimensional;

import java.util.ArrayList;
import java.util.List;

public class MatrixLayerRotation {

    public static void main(String[] args) {

        int m=4;
        int n=4;
        int r=1;

        int nums[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println(solution(nums,m,n,r));

    }

    public static int [][] solution(int nums[][], int m, int n, int r) {

        int layers = Math.min(m, n) / 2;

        for (int layer = 0; layer < layers; layer++) {

            List<Integer> elements = new ArrayList<>();

            int top = layer;
            int left = layer;
            int right = n - 1 - layer;
            int bottom = m - 1 - layer;

            for (int j = left; j <= right; j++) { //top row

                elements.add(nums[top][j]);
            }
            for (int i = top + 1; i <= bottom; i++) { //right col

                elements.add(nums[i][right]);

            }
            // bottom row
            for (int j = right - 1; j >= left; j--) {
                elements.add(nums[bottom][j]);
            }

            // left col
            for (int i = bottom - 1; i > top; i--) {
                elements.add(nums[i][left]);
            }
            int len = elements.size();
            int R = r % len;

            // Rotate left by r
            List<Integer> rotated = new ArrayList<>();
            rotated.addAll(elements.subList(R, len));
            rotated.addAll(elements.subList(0, R));

            // Put rotated values back
            int idx = 0;

            // top row
            for (int j = left; j <= right; j++)
                nums[top][j] = rotated.get(idx++);

            // right col
            for (int i = top + 1; i <= bottom; i++)
                nums[i][right] = rotated.get(idx++);

            // bottom row
            for (int j = right - 1; j >= left; j--)
                nums[bottom][j] = rotated.get(idx++);

            // left col
            for (int i = bottom - 1; i > top; i--)
                nums[i][left] = rotated.get(idx++);
        }
        print(nums);
        return  null;
    }

        public static void print(int nums[][]) {
            for (int[] row : nums) {
                for (int v : row) {
                    System.out.print(v + " ");
                }
                System.out.println();
            }
        }
}
