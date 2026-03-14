package recursion;

/*
Question:
Write a Java program to find the factorial of a number using recursion.

Recurrence Relation:
If the current result depends on the result of the previous step,
it is called a recurrence relation.

Example:
Factorial

n! = n × (n-1)!

Example:
5! = 5 × 4 × 3 × 2 × 1 = 120

Concept Used:
Recursion

Recursion:
When a method calls itself repeatedly to solve a problem,
it is called recursion.

Important:
A base condition must be present to stop recursion.
Otherwise it may lead to StackOverflowError.
*/

public class FactorialUsingRecursion {

    public static void main(String[] args) {

        int n = 5;

        int result = fact(n);

        System.out.println("Factorial = " + result);

    }

    static int fact(int n) {

        if (n == 0)
            return 1;

        return n * fact(n - 1);

    }

}