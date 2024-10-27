import java.util.Scanner;

public class q7 {
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

        int[][] ab = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ab[i][j] = a[i][j] + b[i][j];
            }
        }

        int[] ab_sum = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ab_sum[i] += ab[i][j];
            }
        }

        // selection sort rows & sum rows
        for (int i = 1; i < ab_sum.length; i++) {
            int key = ab_sum[i];
            int[] tempRow = ab[i];
            int j = i - 1;
            while (j >= 0 && ab_sum[j] > key) {
                ab_sum[j + 1] = ab_sum[j];
                ab[j + 1] = ab[j];

                j--;
            }
            ab_sum[j + 1] = key;
            ab[j + 1] = tempRow;

        }

        // reverse rows
        for (int i = 0; i < ab.length / 2; i++) {
            int[] temp = ab[i];
            ab[i] = ab[ab.length - 1 - i];
            ab[ab.length - 1 - i] = temp;

        }

        // show data
        System.out.print("[");
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    System.out.print("[");
                }
                System.out.print(ab[i][j]);
                if (j != n - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("]");

            if (i != n - 1) {
                System.out.print(",");
                System.out.println();
            }

        }
        System.out.print("]");
        sc.close();

    }

}
