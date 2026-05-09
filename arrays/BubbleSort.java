package arrays;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {9, 2, 4, 1, 10, 6, 3, 2, 8, 1, 2, 3};
        solution(a);
    }

    static void solution(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}