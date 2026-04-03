package patterns;

import java.util.Scanner;

public class InvertedPyramid {

    public static void main(String[] args) {
        System.out.println("Enter number of row");
        int n = new Scanner(System.in).nextInt();

        int sp = 0;
        int st = (n * 2) - 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= st; k++) {
                System.out.print("*");
            }
            sp++;
            st = st - 2;
            System.out.println();
        }
    }
}