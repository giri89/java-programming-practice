package strings;

public class PrintASCIIValues {
    public static void main(String[] args) {

        String str = "Java";

        for (int i = 0; i < str.length(); i++) {

            System.out.println(str.charAt(i)
                    + " = " + (int) str.charAt(i));
        }
    }
}
