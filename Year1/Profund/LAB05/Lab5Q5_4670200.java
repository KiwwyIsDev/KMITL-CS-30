public class Lab5Q5_4670200 {
    public static void main(String[] args) {
        int layer = 3;
        int numLines = 4;
        int numStars;
        for (int i = 0; i < layer; i++) {
            numStars = (2 * i) - 1;
            for (int j = 0; j < numLines; j++) {
                numStars += 2;
                for (int space = 1; space <= numLines - j - i + 1; space++) {
                    System.out.print(space);
                }
                for (int k = 0; k < numStars; k++) {
                    System.out.print("*");
                } // k

                System.out.println();

            } // j
        } // i

        // give some space <3
        for (int e = 0; e < layer; e++) {
            for (int space_n = 0; space_n < numLines; space_n++) {
                System.out.print(" ");
            }
            for (int f = 0; f < layer; f++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
