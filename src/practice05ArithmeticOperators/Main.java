package practice05ArithmeticOperators;

public class Main {
    public static void main(String[] args) {

        // Arithmetic Operators

        int x = 10;
        int y = 2;
        int z;

        /* z = x + y;
         z = x - y;
         z = x * y;
         z = x / y;
         z = x % y;
        */

        // Augmented Assignment Operators

        /* x = x + y; x += y;
        x = x - y; x -= y;
        x = x * y; x *= y;
        x = x / y; x /= y;
        x = x % y; x %= y; */

        // Increment and Decrement Operators

        /* x = x + 1; x++;
        x = x - 1; x--; */

        // ORDER OF OPERATIONS [P-E-M-D-A-S]

        double result = 3 + 4 * (7 - 5) / 2.0;

        System.out.println(result);
    }
}
