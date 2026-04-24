package arrays.operations;

import java.util.Arrays;

public class AddAtEnd {
    public static void main(String[] args) {
        int a[] = {4, 6, 2, 4, 3};
        System.out.println(Arrays.toString(a));
        int res[] = addAtEnd(a, 20);
        System.out.println(Arrays.toString(res));
    }

    static int[] addAtEnd(int a[], int newElement) {
        int temp[] = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];
        }
        temp[a.length] = newElement;
        return temp;
    }
}