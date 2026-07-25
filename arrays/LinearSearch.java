package arrays;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {15, 25, 35, 45, 55};

        System.out.println(search(arr, 35));
    }

    static int search(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {
                return i;
            }
        }

        return -1;
    }
}