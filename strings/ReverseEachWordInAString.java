package strings.reversePatterns;

public class ReverseEachWordInAString {

    public static void main(String[] args) {


        String str = "Let's take LeetCode contest";

        System.out.println(reverseEachWord(str));


    }

    public static String reverseEachWord(String str) {

        StringBuilder result = new StringBuilder();

        String words[] = str.split(" ");

        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            for (int j = word.length() - 1; j >= 0; j--) {

                result.append(word.charAt(j));

            }

            result.append(" ");
        }


        return new String(result);

    }


}
