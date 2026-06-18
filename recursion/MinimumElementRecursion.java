package recursion;

public class MinimumElementRecursion {
    public static void main(String[] args) {

        int[] arr = {40, 20, 60, 10, 90};

        System.out.println(min(arr, 0));
    }

    static int min(int[] arr, int index) {

        if (index == arr.length - 1) {
            return arr[index];
        }

        int min = min(arr, index + 1);

        return arr[index] < min ? arr[index] : min;
    }
}