package recursion;

public class RecursionTreePattern {
    public static void main(String[] args) {
        m1(1);
    }

    static void m1(int a) {
        if (a > 3) return;
        m1(a + 1);
        System.out.println(a);
        m1(a + 1);
    }
}