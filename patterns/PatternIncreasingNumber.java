package patterns;

import java.util.Scanner;

public class PatternIncreasingNumber {
    public static void main(String[] args) {
        System.out.println("Enter no of rows : ");
        int n = new Scanner(System.in).nextInt();

        for (int i = n; i >= 1; i--) {
            int val = 1;
            for (int j = i; j >= 1; j--) {
                System.out.print(val);
                val++;
            }
            System.out.println();
        }
    }
}