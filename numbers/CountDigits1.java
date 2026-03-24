package numbers;

public class CountDigits1 {
    public static void main(String[] args) {
        System.out.println(countDigits(41564841));
    }

    static int countDigits(int n) {
        int count = 0;

        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}