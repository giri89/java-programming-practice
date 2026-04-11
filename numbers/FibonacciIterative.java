package numbers;

import java.util.Arrays;

public class FibonacciIterative {
    public static void main(String[] args) {
        sol(10);
    }

    static void sol(int n) {
        int a[] = new int[n];
        a[0] = 0;
        a[1] = 1;
        for (int i = 2; i < a.length; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        System.out.println(Arrays.toString(a));
    }
}
	