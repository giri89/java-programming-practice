package recursion;

/*
Question:
Write a Java program to find the sum of the first N natural numbers
using recursion.

Example:
Input  : 4
Output : 10

Explanation:
sum(4)
= 4 + sum(3)
= 4 + 3 + sum(2)
= 4 + 3 + 2 + sum(1)
= 4 + 3 + 2 + 1
= 10
*/

public class SumUsingRecursion {

    public static void main(String[] args) {

        int n = 4;

        int result = sum(n);

        System.out.println("Sum = " + result);

    }

    static int sum(int n) {

        if (n == 0)
            return 0;

        return n + sum(n - 1);

    }

}