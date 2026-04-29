package arrays;

public class JaggedArrayPrintIndexed {
    public static void main(String[] args) {
        int a[][] = {
            {2, 3, 4},
            {6, 2, 1, 7},
            {5, 2, 1}
        };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}