package arrays.operations;

public class MultiplicationOfArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        int mul = 1;
        for (int i = 0; i < a.length; i++) {
            mul *= a[i];
        }

        System.out.println(mul);
    }
}