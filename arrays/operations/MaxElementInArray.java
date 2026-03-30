package arrays.operations;

public class MaxElementInArray {
    public static void main(String[] args) {
        int[] a = {2, 3, 9, 1, 5, 6};

        int res = max(a);
        System.out.println(res);
    }

    static int max(int[] a) {
        int max = Integer.MIN_VALUE;

        for (int x : a) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }
}