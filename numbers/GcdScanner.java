package numbers;

import java.util.Scanner;

public class GcdScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1 = sc.nextInt();
        System.out.println("Enter second number:");
        int n2 = sc.nextInt();
        int res = gcd(n1, n2);
        System.out.println("GCD of " + n1 + " and " + n2 + " is " + res);
    }

    static int gcd(int n1, int n2) {
        int min = Math.min(n1, n2);
        for (int i = min; i >= 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                return i;
            }
        }
        return 1;
    }
}