package basics;

public class LeetCode1323 {


    public static void main(String[] args) {

        System.out.println(maximum69Number(9996));
    }

    public static int maximum69Number(int num) {

        String str = Integer.toString(num);

        String result = str;

        int index = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '6') {

                index = i;
                break;
            }

        }

        System.out.println(index);
        result = result.substring(0, index) + '9' + result.substring(index + 1);

        return Integer.valueOf(result);

    }
}
