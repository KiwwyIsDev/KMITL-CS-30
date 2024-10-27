import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        //
        System.out.print("[");
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    System.out.print("[");
                }
                System.out.print(a[i][j] + b[i][j]);
                if (j != n - 1) {
                    System.out.print(", ");
                } else {
                    System.out.print("]");
                }
            }
            if (i != n - 1) {
                System.out.print(",");
                System.out.println();

            }
        }

        System.out.print("]");

        sc.close();

    }

    static void advance() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int[][] a = new int[n][n];
        // int[][] b = new int[n][n];

        int[][] ab = new int[n][n];
        for (int i = 0; i < 2; i++) {
            int x = 0;
            int y = 0;
            int count = 0;

            while (true) {
                if (count == n * n)
                    break;
                int data = sc.nextInt();
                if (x == n) {
                    x = 0;
                    y++;
                }
                ab[y][x] += data;

                x++;
                count++;

            }
        }
        sc.close();
        // for (var e : ab) {
        // System.out.println(Arrays.toString(e));
        // }
    }
}
