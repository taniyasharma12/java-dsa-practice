package stacks;

import java.util.Stack;

public class NextGreaterElementToTheRightStack {

    public static void main(String[] args) {
        int arr[] = {2, 5, 9, 3, 1, 12, 6, 8, 7};

        int[] result = solution(arr);

        for (int i = 0; i < result.length; i++) {

            System.out.print(result[i] + " ");
        }

    }

    public static int[] solution(int arr[]) {

        Stack<Integer> st = new Stack();
        int nge[] = new int[arr.length];
        nge[arr.length - 1] = -1;
        st.push(arr[arr.length - 1]);
        for (int i = arr.length - 1; i >= 0; i--) {

            while (st.size() > 0 && arr[i] > st.peek()) {

                st.pop();

            }

            if (st.size() == 0) {

                nge[i] = -1;
            } else {

                nge[i] = st.peek();
            }

            st.push(arr[i]);


        }


        return nge;

    }
}
