package numbers;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        int n = new Scanner(System.in).nextInt();
        System.out.println(isPalindrome(n));
    }

    static boolean isPalindrome(int n) {
        int temp = n;
        int rev = 0;

        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            rev = rev * 10 + rem;
        }
        return rev == temp;
    }
}