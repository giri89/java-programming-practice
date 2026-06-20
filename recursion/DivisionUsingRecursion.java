package recursion;

public class DivisionUsingRecursion {
    public static void main(String[] args) {

        System.out.println(divide(20, 4));
    }

    static int divide(int dividend, int divisor) {

        if (dividend < divisor) {
            return 0;
        }

        return 1 + divide(
                dividend - divisor,
                divisor);
    }
}