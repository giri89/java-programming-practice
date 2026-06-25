package recursion;

public class PrintEvenNumbersRecursion {
    public static void main(String[] args) {
        printEven(2, 20);
    }

    static void printEven(int current, int end) {

        if (current > end) {
            return;
        }

        System.out.print(current + " ");

        printEven(current + 2, end);
    }
}