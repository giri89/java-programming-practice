package numbers;

public class OddNumbersInRange {
    public static void main(String[] args) {
        printOdd(1, 20);
    }

    static void printOdd(int start, int end) {

        for (int i = start; i <= end; i++) {

            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}