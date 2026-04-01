package maps;

public class Leetcode1704 {

    public static void main(String[] args) {

        System.out.println(halvesAreAlike("book"));
    }

    public static boolean halvesAreAlike(String s) {

        int i = 0;

        int j = s.length() / 2;

        int leftCount = 0;

        int rightCount = 0;

        while (i < s.length() && j < s.length()) {

            if (isVowel(s.charAt(i))) {
                leftCount++;
            }

            if (isVowel(s.charAt(j))) {
                rightCount++;
            }

            i++;
            j++;
        }

        return leftCount==rightCount;
    }

    public static boolean isVowel(char ch) {

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;

    }
}