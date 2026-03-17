package patterns;

import java.util.Scanner;

// Pattern with user-defined size

public class DynamicDiagonalPattern {

    public static void main(String[] args) {

        System.out.println("Enter number of rows");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n; j++) {

                if(i==1 || i==n || j==1 || j==n || i+j==n+1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }

            System.out.println();
        }

    }

}