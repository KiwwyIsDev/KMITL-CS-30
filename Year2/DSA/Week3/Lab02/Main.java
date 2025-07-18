package Lab02;

import Lab02.pack.*;
import Lab02.solutions.*;

public class Main {
    public static void main(String[] args) {
        // testIsPrime012();

        // L2_IsPrimeInterface wow1 = new IsPrime0();
        // L2_IsPrimeInterface wow2 = new IsPrime1();
        // L2_IsPrimeInterface wow3 = new IsPrime2();

        // bench_isPrime(wow1);
        // bench_isPrime(wow2);
        // bench_isPrime(wow3);

    }

    private static void testIsPrime012() {
        int N = 100;
        int count = 0;
        L2_IsPrimeInterface obj = new IsPrime0();
        for (int n = 1; n < N; n++) {
            if (obj.isPrime(n))
                count++;
        }
        System.out.println("Pi (" + N + ")= " + count);

        count = 0;
        obj = new IsPrime1();
        for (int n = 1; n < N; n++) {
            if (obj.isPrime(n))
                count++;
        }
        System.out.println("Pi (" + N + ")= " + count);

        count = 0;
        obj = new IsPrime2();
        for (int n = 1; n < N; n++) {
            if (obj.isPrime(n))
                count++;
        }
        System.out.println("Pi (" + N + ")= " + count);
    }

    public static void bench_isPrime(L2_IsPrimeInterface obj) {
        int your_cpu_factor = 1; /* increase by 10 times */
        int N = 100;
        int count = 0;
        // long start = 0;
        for (N = 100_000; N <= 1_000_000 * your_cpu_factor; N += 100_000 * your_cpu_factor) {
            count = 0;
            long start = System.currentTimeMillis();
            for (int n = 1; n < N; n++) {
                if (obj.isPrime(n))
                    count++;
            }
            long time = (System.currentTimeMillis() - start);
            // System.out.println(N + "\t" + count + "\t" + time);
            System.out.printf("%s\t %s\t %s\n",
                    String.format("%,d", N), String.format("%,d", count),
                    String.format("%,d", time));
        }
    }
}
