package numbers;

public class EvenNumbersInRange {
    public static void main(String[] args) {
        printEven(1, 20);
    }

    static void printEven(int start, int end) {

        for (int i = start; i <= end; i++) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}