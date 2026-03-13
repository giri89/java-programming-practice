package patterns;

// Print a 5x5 solid square star pattern

public class SolidSquarePattern {

    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++) {

            for(int j = 1; j <= 5; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

}