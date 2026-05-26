package arrays;

public class CountEvenOdd {
    public static void main(String[] args) {

        int[] arr = {11, 22, 33, 44, 55, 66};

        count(arr);
    }

    static void count(int[] arr) {

        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}
