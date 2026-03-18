package patterns;

import java.util.Scanner;

public class SnakePattern {
    public static void main(String[] args) {
        System.out.println("Enter number of rows:");
        int n = new Scanner(System.in).nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                int val = (i - 1) * n + 1;
                for (int j = 1; j <= n; j++) {
                    System.out.print(val + "\t");
                    val++;
                }
            } else {
                int val = i * n;
                for (int j = 1; j <= n; j++) {
                    System.out.print(val + "\t");
                    val--;
                }
            }
            System.out.println();
        }
    }
}