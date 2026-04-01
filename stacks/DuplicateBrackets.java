package stacks;

import java.util.Stack;

public class DuplicateBrackets {

    public static void main(String[] args) {

        String str = "((a+b))";

        System.out.println(hasDuplicate(str));
    }

    /*
       push all elements except closing bracket
       if closing bracket check peek
         -if peek is opening bracket that means duplicate is present so return true
         -if peek is not opening bracket then pop until opening bracket comes then pop opening bracket as well
         -return false at end which will be returned if first condition is not met

     */
    public static boolean hasDuplicate(String str) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch != ')') {

                stack.push(ch);
            } else if (ch == ')') {
                if (stack.peek() == '(') {

                    return true;
                } else {
                    while (stack.peek() != '(') {

                        stack.pop();
                    }
                    stack.pop();
                }
            }
        }

        return false;
    }

}

