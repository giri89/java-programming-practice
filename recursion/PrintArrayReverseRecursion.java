package recursion;

public class PrintArrayReverseRecursion {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        print(arr, arr.length - 1);
    }

    static void print(int[] arr, int index) {

        if (index < 0) {
            return;
        }

        System.out.print(arr[index] + " ");

        print(arr, index - 1);
    }
}