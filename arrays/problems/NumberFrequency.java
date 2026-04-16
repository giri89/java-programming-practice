package arrays.problems;

public class NumberFrequency {
    public static void main(String[] args) {
        int a[] = {1, 2, 9, 2, 6, 0, 4, 2, 6, 1};
        solution(a);
    }

    static void solution(int a[]) {
        int f[] = new int[1001];
        for (int i = 0; i < a.length; i++) {
            int index = a[i];
            f[index]++;
        }
        for (int i = 0; i < f.length; i++) {
            if (f[i] == 0) continue;
            System.out.println(i + "  " + f[i]);
        }
    }
}