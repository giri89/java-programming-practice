package numbers;

/*
Question:
Write a Java program to find the sum of the first N natural numbers
using a loop.

Example:
Input  : 4
Output : 10

Explanation:
1 + 2 + 3 + 4 = 10
*/

public class SumUsingLoop {

    public static void main(String[] args) {

        int n = 4;

        int result = sum(n);

        System.out.println("Sum = " + result);

    }

    static int sum(int n) {

        int sum = 0;

        for (int i = 1; i <= n; i++) {

            sum += i;

        }

        return sum;

    }

}