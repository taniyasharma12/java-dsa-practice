package strings.reversePatterns;

public class ReverseOnlyVowels {

    public static void main(String[] args) {

        String str = "leetcode"; //leotcede

        System.out.println(reverseOnlyVowels(str));

    }


    public static String reverseOnlyVowels(String str) {

        char ch[] = str.toCharArray();
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {

            if (isVowel(ch[i]) == false) {

                i++;
            } else if (isVowel(ch[j]) == false) {
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

    public static boolean isVowel(char c) {

        return "aeiouAEIOU".indexOf(c) != -1;

    }


}
