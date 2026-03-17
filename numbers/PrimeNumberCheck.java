package numbers;

import java.util.Scanner;

/*
Question:
Write a Java program to check whether a given number is prime or not.

Definition:
A prime number is a number that has exactly two factors:
1 and the number itself.

Examples:
7  → Prime
10 → Not Prime
*/

public class PrimeNumberCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");

        int n = sc.nextInt();

        if (isPrime(n))
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");

    }

    static boolean isPrime(int n) {

        if (n <= 1)
            return false;

        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0)
                return false;

        }

        return true;

    }

}