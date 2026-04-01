package strings;

public class ReverseAString {

    public static void main(String[] args) {

        String str = "hello";

        char ch[] = {'h', 'e', 'l', 'l', 'o'};

        System.out.println(reverse(str));
        System.out.println(reverseArray(ch));


    }

    public static String reverse(String str) {

        StringBuilder result = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {

            result.append(str.charAt(i));

        }

        return new String(result);

    }

    public static String reverseArray(char ch[]) {

        int i = 0;
        int j = ch.length - 1;

        while (i <=j) {

            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;

        }
        return new String(ch);

    }
}
