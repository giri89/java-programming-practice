package recursion;

public class ReverseNumberRecursion {

    static int reverse = 0;

    public static void main(String[] args) {
        reverseNumber(1234);
        System.out.println(reverse);
    }

    static void reverseNumber(int n) {

        if (n == 0) {
            return;
        }

        reverse = reverse * 10 + n % 10;

        reverseNumber(n / 10);
    }
}