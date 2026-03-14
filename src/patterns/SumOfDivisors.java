package patterns;

import java.util.Scanner;

// Sum of divisors

public class SumOfDivisors {

    public static void main(String[] args) {

        System.out.println("Enter a number");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;

        for(int i = 1; i * i <= n; i++) {

            if(n % i == 0) {

                sum += i;

                if(n/i != i) {
                    sum += n/i;
                }

            }

        }

        System.out.println("Sum = " + sum);

    }

}