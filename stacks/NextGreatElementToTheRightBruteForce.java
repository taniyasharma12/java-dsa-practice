package stacks;

public class NextGreatElementToTheRightBruteForce {

    public static void main(String[] args) {
        int arr[] = {2, 5, 9, 3, 1, 12, 6, 8, 7};

        int[] result = solution(arr);

        for (int i=0; i<result.length; i++){

            System.out.print(result[i] + " ");
        }

    }

    public static int[] solution(int arr[]) {

        int nge[] = new int[arr.length];
        nge[arr.length - 1] = -1;
        for (int i = 0; i < arr.length; i++) {
            int max = -1;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] < arr[j]) {
                    max = arr[j];
                    break;
                }
            }
            nge[i]=max;
        }
            return nge;
        }
}
