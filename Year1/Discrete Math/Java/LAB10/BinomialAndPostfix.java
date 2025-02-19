public class BinomialAndPostfix {
    
    public static void expandBinomial(int exponent) {
        System.out.print("(a + b)^" + exponent + " = ");
        for (int term = 0; term <= exponent; term++) {
            int coefficient = binomialCoefficient(exponent, term);
            System.out.print(coefficient + "a^" + (exponent - term) + "b^" + term);
            if (term < exponent) System.out.print(" + ");
        }
        System.out.println();
    }

    public static int binomialCoefficient(int n, int k) {
        if (k > n - k) k = n - k;
        int result = 1;
        for (int i = 0; i < k; i++) {
            result *= (n - i);
            result /= (i + 1);
        }
        return result;
    }
  
    
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            expandBinomial(i);
        }
    }
}
