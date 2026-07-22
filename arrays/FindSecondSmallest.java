package arrays;

public class FindSecondSmallest {
    public static void main(String[] args) {

        int[] arr = {12, 45, 67, 23, 89, 54};

        System.out.println(secondSmallest(arr));
    }

    static int secondSmallest(int[] arr) {

        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : arr) {

            if (num < smallest) {
                second = smallest;
                smallest = num;
            } else if (num < second && num != smallest) {
                second = num;
            }
        }

        return second;
    }
}