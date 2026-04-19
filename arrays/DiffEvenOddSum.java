package arrays;

public class DiffEvenOddSum {
    public static void main(String[] args) {
        int a[] = {5, 2, 9, 6, 2, 7};
        System.out.println(diffsum(a));
    }

    static int diffsum(int a[]) {
        int evensum = 0;
        int oddsum = 0;
        for (int x : a) {
            if (x % 2 == 0) {
                evensum += x;
            } else {
                oddsum += x;
            }
        }
        return oddsum - evensum;
    }
}