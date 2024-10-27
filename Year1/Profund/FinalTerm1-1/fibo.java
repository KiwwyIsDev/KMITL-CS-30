public class fibo {
    public static void main(String[] args) {
        int n = 100;
        double[] cache = new double[n + 1];
        System.out.println(fibon(n, cache));
    }

    static double fibon(int n, double[] cache) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (cache[n] == 0) {
            cache[n] = fibon(n - 1, cache) + fibon(n - 2, cache);
        }
        return cache[n];
    }
}
