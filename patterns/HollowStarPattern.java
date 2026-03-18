package patterns;
import java.util.Scanner;

public class HollowStarPattern {
    public static void main(String[] args) {
        System.out.println("Enter number of rows:");
        int n = new Scanner(System.in).nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}