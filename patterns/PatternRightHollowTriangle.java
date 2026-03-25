package patterns;

import java.util.Scanner;

public class PatternRightHollowTriangle {
    public static void main(String[] args) {
        System.out.println("Enter number of rows : ");
        int n = new Scanner(System.in).nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                if (k == 1 || k == i || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}