package patterns;

import java.util.Scanner;

public class PatternDecreasingNumber {
    public static void main(String[] args) {
        System.out.println("Enter no of rows : ");
        int n = new Scanner(System.in).nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}