package arrays;

import java.util.Arrays;

public class BubbleSortSinglePass {

    public static void main(String[] args) {
        int[] a = {9, 2, 4, 1, 10, 6, 3, 2, 8};
        solution(a);
    }

    static void solution(int[] a) {
        for (int j = 0; j < a.length - 1; j++) {
            if (a[j] > a[j + 1]) {
                int temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}