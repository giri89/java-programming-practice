package arrays.operations;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int a[] = {1, 5, 7, 8};
        int b[] = {2, 3, 4, 6, 9, 10};
        int res[] = solution(a, b);
        System.out.println(Arrays.toString(res));
    }

    static int[] solution(int a[], int b[]) {
        int c[] = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i]; i++; k++;
            } else {
                c[k] = b[j]; j++; k++;
            }
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