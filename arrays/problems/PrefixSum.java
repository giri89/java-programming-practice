package arrays.problems;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int a[] = {9, 2, 6, 0, 4, 2};
        solution(a);
        System.out.println(Arrays.toString(a));
    }

    static void solution(int a[]) {
        for (int i = 1; i < a.length; i++) {
            a[i] = a[i] + a[i - 1];
        }
    }
}