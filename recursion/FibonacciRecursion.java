package recursion;

public class FibonacciRecursion {
    public static void main(String[] args) {
        sol(0, 1, 1, 10);
    }

    static void sol(int a, int b, int count, int limit) {
        if (count > limit) return;
        System.out.println(a);
        sol(b, a + b, ++count, limit);
    }
}