package numbers;

/*
Question:
Write a Java program to print all prime numbers between 1 and 100
in reverse order.

Also print:
1. Total number of prime numbers
2. Total number of non-prime numbers
*/

public class PrimeNumbersReverseOrder {

    public static void main(String[] args) {

        int count = 0;

        for (int i = 100; i >= 1; i--) {

            if (isPrime(i)) {

                System.out.println(i);

                count++;

            }

        }

        System.out.println("Total Prime Numbers = " + count);

        System.out.println("Total Non Prime Numbers = " + (100 - count));

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