package arrays;

public class CountPositiveNegative {
    public static void main(String[] args) {

        int[] arr = {10, -5, 0, 20, -7, 8};

        int positive = 0;
        int negative = 0;

        for (int num : arr) {

            if (num > 0)
                positive++;
            else if (num < 0)
                negative++;
        }

        System.out.println("Positive = " + positive);
        System.out.println("Negative = " + negative);
    }
}