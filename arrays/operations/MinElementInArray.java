package arrays.operations;

public class MinElementInArray {
    public static void main(String[] args) {
        int[] a = {2, 6, 8, 5, 1, 9};

        int res = min(a);
        System.out.println(res);
    }

    static int min(int[] a) {
        int min = Integer.MAX_VALUE;

        for (int x : a) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }
}