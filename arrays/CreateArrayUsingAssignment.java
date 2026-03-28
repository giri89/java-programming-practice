package arrays;

public class CreateArrayUsingAssignment {
    public static void main(String[] args) {
        int[] a = new int[5];

        a[0] = 10;
        a[1] = 20;
        a[2] = 25;
        a[3] = 8;
        a[4] = 12;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}