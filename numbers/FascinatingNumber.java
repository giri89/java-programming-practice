package numbers;

public class FascinatingNumber {
    public static void main(String[] args) {
        System.out.println(isFascinating(192));
    }

    static boolean isFascinating(int n) {

        String value = "" + n + (n * 2) + (n * 3);

        for (char ch = '1'; ch <= '9'; ch++) {

            int count = 0;

            for (int i = 0; i < value.length(); i++) {

                if (value.charAt(i) == ch) {
                    count++;
                }
            }

            if (count != 1) {
                return false;
            }
        }

        return true;
    }
}