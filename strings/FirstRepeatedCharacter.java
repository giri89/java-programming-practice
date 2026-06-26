package strings;

public class FirstRepeatedCharacter {
    public static void main(String[] args) {

        String str = "programming";

        System.out.println(firstRepeated(str));
    }

    static char firstRepeated(String str) {

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    return str.charAt(i);
                }
            }
        }

        return '\0';
    }
}