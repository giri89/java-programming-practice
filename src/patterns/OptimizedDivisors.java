package patterns;

import java.util.Scanner;

// Optimized divisor finding

public class OptimizedDivisors {

    public static void main(String[] args) {

        System.out.println("Enter a number");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i * i <= n; i++) {

            if(n % i == 0) {

                System.out.println(i);

                if(n / i != i) {
                    System.out.println(n / i);
                }

            }

        }

    }

}