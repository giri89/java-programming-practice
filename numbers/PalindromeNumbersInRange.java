package numbers;

public class PalindromeNumbersInRange {
    public static void main(String[] args) {
        printPalindrome(1, 200);
    }

    static void printPalindrome(int start, int end) {

        for (int i = start; i <= end; i++) {

            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPalindrome(int n) {

        int temp = n;
        int rev = 0;

        while (n > 0) {

            int rem = n % 10;

            rev = rev * 10 + rem;

            n = n / 10;
        }

        return temp == rev;
    }
}