package strings;

import java.util.Arrays;

public class ReverseCharactersKeepingSpecialCharacters {

    public static void main(String[] args) {

        String str = "ab-cd"; //c,b$a`

        System.out.println(reverse(str));

    }


    public static String reverse(String str) {

        char[] ch = str.toCharArray();
        int i = 0;
        int j = str.length()-1;

        while (i < j) {

            if (isLetter(ch[i]) == false) {

                i++;

            } else if (isLetter(ch[j]) == false) {

                j--;

            } else {

                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }

        }

        return new String(ch);
    }

    public static boolean isLetter(char c) {

        //  if(Character.isLetterOrDigit(c)) can be used as alternative

        if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {

            return true;
        }
        return false;
    }
}
