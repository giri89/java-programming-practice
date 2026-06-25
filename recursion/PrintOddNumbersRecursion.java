package recursion;

public class PrintOddNumbersRecursion {
    public static void main(String[] args) {
        printOdd(1, 19);
    }

    static void printOdd(int current, int end) {

        if (current > end) {
            return;
        }

        System.out.print(current + " ");

        printOdd(current + 2, end);
    }
}