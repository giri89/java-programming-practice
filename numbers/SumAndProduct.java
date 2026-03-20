package numbers;

import java.util.Scanner;

public class SumAndProduct {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        int n = new Scanner(System.in).nextInt();

        int sum = 0;
        int product = 1;

        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            sum += rem;
            product *= rem;
        }

        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
    }
}