package strings;

import java.util.Arrays;

public class reverseOnlyVowels {

    public static void main(String[] args) {

        String s = "leetcode";

        System.out.println(reverseVowel(s));
        //Output: "leotcede"
    }


    public static String reverseVowel(String s) {

        char[] str = s.toCharArray();
        int left = 0;
        int right = str.length - 1;

        while (left <= right) {

            while (left<right && isVowel(str[left]) == false) {
                left++;
            }
            while (left<right && isVowel(str[right]) == false) {
                right--;

            }
            swap(str, left, right);

            left++;
            right --;


        }
return new String(str);
    }

    public static boolean isVowel(char ch) {

        return "aeiouAEIOU".indexOf(ch)!=-1;
    }


    public static void swap(char[] str, int i, int j) {

            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;

        }
    }

