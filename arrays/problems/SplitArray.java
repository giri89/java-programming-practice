package arrays.problems;

import java.util.Arrays;

public class SplitArray {
    public static void main(String[] args) {
        int[] a = {5, 2, 6, 1, 4, 3, 1, 6, 0};

        int[] left = new int[a.length / 2];
        int[] right = new int[a.length - left.length];

        for (int i = 0; i < left.length; i++) {
            left[i] = a[i];
        }

        for (int i = 0; i < right.length; i++) {
            right[i] = a[i + left.length];
        }

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
    }
}