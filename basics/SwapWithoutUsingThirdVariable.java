package basics;

public class SwapWithoutUsingThirdVariable {


    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        System.out.println("Before swap: a = " + a + ", b = " + b);

        a = a + b; // a = 25
        b = a - b; // b = 25-15 = 10
        a = a - b; // a = 25-10 = 15

        System.out.println("After swap: a = " + a + ", b = " + b);

        /*
        XOR stands for "Exclusive OR" — it's a bitwise operator.
        It compares two bits (0s or 1s), and returns:
        1 if the bits are different
        0 if the bits are the same

        x = x ^ y;
        y = x ^ y;  // y becomes original x
        x = x ^ y;  // x becomes original y
         */

        int x = 10;
        int y = 15;

        System.out.println("Before swap: x = " + x + ", y = " + y);

        x = x ^ y; // XOR both numbers → x becomes 5
        y = x ^ y; // XOR new x with y → y becomes 10
        x = x ^ y; // XOR new x with new y → x becomes 15

        System.out.println("After swap: x = " + x + ", y = " + y);
    }

}
