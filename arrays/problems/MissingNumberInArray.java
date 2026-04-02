package arrays.problems;

//public class MissingNumberInArray {
//    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 4, 5, 7, 8, 9};
//
//        int n = a.length + 1;
//        int expected = (n * (n + 1)) / 2;
//
//        int actual = 0;
//        for (int x : a) {
//            actual += x;
//        }
//
//        System.out.println(expected - actual);
//    }
//}


public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 7, 8, 9};

        int res = missingNumber(a);
        System.out.println(res);
    }

    static int missingNumber(int[] a) {
        int n = a.length + 1;

        int expected = (n * (n + 1)) / 2;

        int actual = 0;
        for (int x : a) {
            actual += x;
        }

        return expected - actual;
    }
}