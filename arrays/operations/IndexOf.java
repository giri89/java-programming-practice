package arrays.operations;

public class IndexOf {
    public static void main(String[] args) {
        int a[] = {4, 2, 6, 1, 5, 4, 8};
        System.out.println(indexOf(a, 9));
    }

    static int indexOf(int a[], int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }
}