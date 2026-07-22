package arrays;

public class FindSecondLargest {
    public static void main(String[] args) {

        int[] arr = {12, 45, 67, 23, 89, 54};

        System.out.println(secondLargest(arr));
    }

    static int secondLargest(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num > second && num != largest) {
                second = num;
            }
        }

        return second;
    }
}