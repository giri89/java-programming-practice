package recursion;

public class PrintNumbersAscending {
    public static void main(String[] args) {
        print(1, 10);
    }

    static void print(int start, int end) {

        if (start > end) {
            return;
        }

        System.out.print(start + " ");

        print(start + 1, end);
    }
}