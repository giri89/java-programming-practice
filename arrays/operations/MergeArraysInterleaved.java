package arrays.operations;

import java.util.Arrays;

public class MergeArraysInterleaved {
    public static void main(String[] args) {
        int a[] = {9, 2, 6, 0};
        int b[] = {4, 5, 6, 1, 3, 7};
        int res[] = solution(a, b);
        System.out.println(Arrays.toString(res));
    }

    static int[] solution(int a[], int b[]) {
        int c[] = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            c[k] = a[i]; i++; k++;
            c[k] = b[j]; j++; k++;
        }
        while (i < a.length) {
            c[k] = a[i]; i++; k++;
        }
        while (j < b.length) {
            c[k] = b[j]; j++; k++;
        }
        return c;
    }
}