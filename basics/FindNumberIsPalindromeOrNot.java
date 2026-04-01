package basics;

public class FindNumberIsPalindromeOrNot {

    public static void main(String[] args) {

        int input = 45;
        System.out.println(isPalindrome(input));

    }

    public static boolean isPalindrome(int input) {

        int temp = input;
        int rev = 0;

        while (temp > 0) {

            int rem = temp % 10; //5

            temp = temp / 10; //4

            rev = rev * 10 + rem; //5

        }
        System.out.println(rev);
        return rev == input;
    }

}
