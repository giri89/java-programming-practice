package arrays;

public class FactorialOfArrayElements {
    public static void main(String[] args) {
        int a[] = {4, 2, 0, 3, 5};
        printFact(a);
    }

    static void printFact(int a[]) {
        for (int x : a) {
            System.out.println(factorial(x));
        }
    }

    static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}