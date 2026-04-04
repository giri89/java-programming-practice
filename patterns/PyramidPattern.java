package patterns;

import java.util.Scanner;

public class PyramidPattern {

    public static void main(String[] args) {
        System.out.println("Enter number of row");
        int n = new Scanner(System.in).nextInt();

        int sp = n - 1;
        int st = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= st; k++) {
                System.out.print("*");
            }
            sp--;
            st = st + 2;
            System.out.println();
        }
    }
}