package recursion;

public class PrintArrayRecursion {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        print(arr, 0);
    }

    static void print(int[] arr, int index) {

        if (index == arr.length) {
            return;
        }

        System.out.print(arr[index] + " ");

        print(arr, index + 1);
    }
}