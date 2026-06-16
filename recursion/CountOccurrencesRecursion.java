package recursion;

public class CountOccurrencesRecursion {
    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 10};

        System.out.println(count(arr, 0, 10));
    }

    static int count(int[] arr, int index, int key) {

        if (index == arr.length) {
            return 0;
        }

        if (arr[index] == key) {
            return 1 + count(arr, index + 1, key);
        }

        return count(arr, index + 1, key);
    }
}