package numbers;

/*
Question:
Write a Java program to find the sum of the first N natural numbers
using a mathematical formula.

Formula:
Sum = n(n + 1) / 2

Example:
Input  : 4
Output : 10
*/

public class SumUsingFormula {

    public static void main(String[] args) {

        int n = 4;

        int result = sum(n);

        System.out.println("Sum = " + result);

    }

    static int sum(int n) {

        return (n * (n + 1)) / 2;

    }

}