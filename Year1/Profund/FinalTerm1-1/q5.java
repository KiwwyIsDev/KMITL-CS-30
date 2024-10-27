import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 0 && n < 10) {
            int[][] a = new int[n][n];
            for (int i = 0; i < a[0].length; i++) {

                for (int j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();

                }

            }

            System.out.print("[");
            for (int i = 0; i < a.length; i++) {

                for (int j = 0; j < a[0].length; j++) {
                    if (j == 0) {
                        System.out.print("[");
                    }
                    System.out.print(a[i][j]);
                    if (j != a[0].length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.print("]");

                if (i != a.length - 1) {
                    System.out.print(",");
                    System.out.println();
                }

            }
            System.out.print("]");
        }

        sc.close();

    }
}
