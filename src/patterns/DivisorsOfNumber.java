package patterns;

import java.util.Scanner;

// Print all divisors of a number

public class DivisorsOfNumber {

    public static void main(String[] args) {

        System.out.println("Enter a number");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n/2; i++) {

            if(n % i == 0) {
                System.out.println(i);
            }

        }

        System.out.println(n);

    }

}