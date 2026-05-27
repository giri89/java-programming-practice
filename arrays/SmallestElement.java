package arrays;

public class SmallestElement {
    public static void main(String[] args) {

        int[] arr = {12, 45, 7, 89, 23};

        System.out.println(smallest(arr));
    }

    static int smallest(int[] arr) {

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}