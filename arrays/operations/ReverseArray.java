package arrays.operations;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int a[] = {4, 5, 9, 1, 6, 2, 8};
        System.out.println(Arrays.toString(a));
        reverse(a);
        System.out.println(Arrays.toString(a));
    }

    static void reverse(int a[]) {
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
}