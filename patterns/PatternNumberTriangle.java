package patterns;

import java.util.Scanner;

public class PatternNumberTriangle {
    public static void main(String[] args) {
        System.out.println("Enter no of rows : ");
        int n = new Scanner(System.in).nextInt();

        int val = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(val++ + "\t");
            }
            System.out.println();
        }
    }
}