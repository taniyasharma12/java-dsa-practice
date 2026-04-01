package stacks;

import java.util.Stack;

public class EvaluateReversePolishNotation {

    public static void main(String[] args) {

        String str[] = {"2","1","+","3","*"};

        System.out.println(evaluate(str));

    }

    public static int evaluate(String[] str) {


        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < str.length; i++) {

            if (str[i].equals("+") || str[i].equals("*") || str[i].equals("-") || str[i].equals("/") && st.size()>0) {

                int a = st.pop();
                int b = st.pop();

                int ans = operation(a,b,str[i]);

                st.push(ans);
            }
            else{

                st.push(Integer.valueOf(str[i]));
            }


        }

        return st.peek();

    }

    public static int operation(int a, int b, String op) {

        if(op.equals("+")) {

            return  a+b;
        }
        else if(op.equals("-")) {

            return  b-a;
        }
        else if(op.equals("*")) {

            return  a*b;
        }
        else if(op.equals("/")) {

            return  b/a;
        }

        return 0;
    }
}
