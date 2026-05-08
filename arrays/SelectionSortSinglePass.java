package arrays;

import java.util.Arrays;

public class SelectionSortSinglePass {

    public static void main(String[] args) {
        int[] a = {9, 5, 4, 1, 10, 6, 3, 2, 8, 1, 2, 3};
        solution(a);
    }

    static void solution(int[] a) {
        int min = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[min]) {
                min = i;
            }
        }
        int temp = a[min];
        a[min] = a[0];
        a[0] = temp;
        System.out.println(Arrays.toString(a));
    }
}