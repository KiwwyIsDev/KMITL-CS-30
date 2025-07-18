package Lab02.pack;
import Lab02.solutions.L2_IsPrimeInterface;

public class IsPrime2 implements L2_IsPrimeInterface {
    public boolean isPrime(int n) {
        if (n == 1) return false;
        if (n <= 3) return true;
        if ((n % 2 == 0) || (n % 3 == 0)) return false;
        int m = (int) Math.sqrt(n);
        for (int i = 2; i <= m; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}