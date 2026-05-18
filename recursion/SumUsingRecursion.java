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

//1. She brings chaos, not peace.
//2. She can’t take accountability, everything is someone else’s fault.
//3. She tests your boundaries and gets rewarded for it.
//4. She wants your success, but not your standards.
//5. She’s inconsistent (hot/cold, on/off, confusion).
//6. She disrespects you “as a joke.”
//7. She can’t communicate without drama.
//8. She competes with you instead of supporting you.
//9. She loves attention more than connection.
//10. You feel drained after seeing her, not grounded.
//A future wife doesn’t make you anxious.
//She makes your life feel clearer.
//Love shows up under pressure. Absence in tough times is a pattern, not bad timing.