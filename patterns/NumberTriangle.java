package patterns;

import java.util.Scanner;

public class NumberTriangle {
    public static void main(String[] args) {
        System.out.println("Enter number of rows:");
        int n = new Scanner(System.in).nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}