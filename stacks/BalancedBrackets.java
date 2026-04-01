package stacks;

import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {

        String str = "(()()))";


        System.out.println(isBalanced(str));

    }

    /*
    push the opening brackets
    when closing bracket appears check peek if it is opening bracket pop
    then check the stack

     */

    public static boolean isBalanced(String str) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == '(') {

                stack.push(ch);
            } else if (ch == ')') {

                if (stack.isEmpty()  || stack.peek() != '(') {

return false;
                }

                stack.pop();
            }


        }


        return stack.isEmpty();

    }
}
