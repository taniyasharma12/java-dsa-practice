package strings.reversePatterns;

public class ReverseWordsInAString {

    public static void main(String[] args) {

        String str = "  hello    world  ";

        System.out.println(reverseWords(str));
    }


    public static String reverseWords(String str) {

        String words[] = str.trim().split("\\s+");  // \\s matches one whitespace \\s+ matches one or more whitespace characters

        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {

            result.append(words[i] + " ");

        }

        return new String(result);
    }

}
