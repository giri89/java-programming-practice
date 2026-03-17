package recursion;

import java.util.Scanner;

public class PrimeNumberCheck {

    public static void main(String[] args) {

        System.out.println("Enter a number:");
        int n = new Scanner(System.in).nextInt();

        System.out.println(solution(n));
    }

    public static boolean solution(int n) {

        if(n <= 1)
            return false;

        for(int i = 2; i * i <= n; i++) {

            if(n % i == 0) {
                return false;
            }

        }
        return true;
    }
}