package arrays;

public class SortArrayAscending {
    public static void main(String[] args) {

        int[] arr = {50, 20, 10, 40, 30};

        sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}