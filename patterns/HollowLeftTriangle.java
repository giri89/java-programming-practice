package patterns;

import java.util.Scanner;

public class HollowLeftTriangle {

    public static void main(String[] args) {
        System.out.println("Enter number of row");
        int n = new Scanner(System.in).nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                if (i == 1 || i == n || k == 1 || k == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}