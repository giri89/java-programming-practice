package recursion;

public class LinearSearchRecursion {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println(search(arr, 0, 40));
    }

    static boolean search(int[] arr, int index, int key) {

        if (index == arr.length) {
            return false;
        }

        if (arr[index] == key) {
            return true;
        }

        return search(arr, index + 1, key);
    }
}