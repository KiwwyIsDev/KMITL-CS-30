import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        System.out.print("[");
        for (int i = 0; i < a[0].length; i++) {
            System.out.print("[");
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
                if (j != a[i].length - 1) {  
                    System.out.print(", ");
                }
            }
            if (i != a[0].length - 1) {
                System.out.print("],");
                System.out.println();
            } else {
                System.out.print("]");
            }

        }
        System.out.print("]");
        sc.close();

    }
}
