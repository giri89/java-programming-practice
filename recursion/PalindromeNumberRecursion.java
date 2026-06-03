package recursion;

public class PalindromeNumberRecursion {

    static int reverse = 0;

    public static void main(String[] args) {

        int n = 121;

        reverseNumber(n);

        System.out.println(n == reverse);
    }

    static void reverseNumber(int n) {

        if (n == 0) {
            return;
        }

        reverse = reverse * 10 + n % 10;

        reverseNumber(n / 10);
    }
}