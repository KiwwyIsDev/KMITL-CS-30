public class Q3 {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i == 4) {
                    System.out.print("*");
                } else if (j == 4) {
                    System.out.print("+");
                } else if (j + i <= 3) {
                    System.out.print("A");
                } else if (j - i >= 5) {
                    System.out.print("B");
                } else if (i - j >= 5) {
                    System.out.print("C");
                } else if (j + i >= 12) {
                    System.out.print("D");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
