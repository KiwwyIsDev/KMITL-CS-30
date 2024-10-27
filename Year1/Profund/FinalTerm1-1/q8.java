import java.util.Arrays;

public class q8 {
    public static void main(String[] args) {
        int n = 10;
        int[][] a = new int[10][10];
        for (int score = 1; score <= 5; score++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == score - 1 || j == score - 1 || i == n - score || j == n - score) {
                        a[j][i] = score;
                    }
                }
            }
        }

        for (var x : a) {
            System.out.println(Arrays.toString(x));
        }
    }
}
