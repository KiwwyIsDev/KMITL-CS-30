public class Lab5Q5_3670200 {
    public static void main(String[] args) {
        int n = 4;
        int k = 0;
        for (int i = 1; i <= n; i++) {

            for (int j = i; j < n + 1; j++) {
                System.out.print(" ");
            }

            while (k != 2 * i - 1) {
                System.out.print("P");
                k++;
            }
            k = 0;
            System.out.println();
        }
    }
}
