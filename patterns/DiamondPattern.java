package patterns;

import java.util.Scanner;

public class DiamondPattern {

    public static void main(String[] args) {
        System.out.println("Enter Sequence no.");
        int n = new Scanner(System.in).nextInt();

        int st = 1;
        int sp = n - 1;

        for (int i = 1; i <= (2 * n - 1); i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= st; k++) {
                System.out.print("*");
            }

            if (i < n) {
                sp--;
                st += 2;
            } else {
                sp++;
                st -= 2;
            }
            System.out.println();
        }
    }
}