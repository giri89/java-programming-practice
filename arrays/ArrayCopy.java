package arrays;

import java.util.Arrays;

public class ArrayCopy {

    public static void main(String[] args) {
        int[] a = {9, 5, 4, 1, 10, 6, 3, 2, 8, 1, 2, 3, 0};
        int[] b = new int[6];
        System.arraycopy(a, 2, b, 0, 6);
        System.out.println(Arrays.toString(b));
    }
}