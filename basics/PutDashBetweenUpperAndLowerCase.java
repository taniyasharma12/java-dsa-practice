package basics;

public class PutDashBetweenUpperAndLowerCase {

    public static void main(String[] args) {

        String str = "helloWorldThisIsTest";

        // Expected output: hello_World_This_Is_Test

        System.out.println(solution(str));
    }

    public static String solution(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);

            // Add underscore if current char is uppercase and previous char is lowercase
            if (Character.isUpperCase(current) && Character.isLowerCase(str.charAt(i - 1))) {
                result += "_";
            }

            result += current;
        }
        return result;
    }
}
