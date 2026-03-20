package numbers;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        int n = new Scanner(System.in).nextInt();
        System.out.println(isStrong(n));
    }

    static boolean isStrong(int n) {
        int sum = 0;
        int temp = n;

        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            sum += factorial(rem);
        }
        return temp == sum;
    }

    static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}