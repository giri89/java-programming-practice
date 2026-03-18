package numbers;

public class FibonacciSequence {
    public static void main(String[] args) {
        fibonacci(10);
    }

    static void fibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
