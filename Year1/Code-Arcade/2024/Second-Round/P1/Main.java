import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        int result = calculateBinomialCoefficient(n, r);
        System.out.println(result);
        scanner.close();

    }

    public static int calculateBinomialCoefficient(int n, int r) {
        if (r == 0 || r == n) {
            return 1;
        } else {
            return calculateBinomialCoefficient(n - 1, r - 1) + calculateBinomialCoefficient(n - 1, r);
        }
    }

}