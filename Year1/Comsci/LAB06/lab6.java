import java.util.Arrays;

class lab6 {
    public static void main(String[] args) {
        char[] labels = { 'a', 'b', 'c', 'd' };
        int[] values = { 20, 30, 50, 10 };
        int[] weights = { 2, 5, 10, 5 };
        double[] perW = new double[values.length];
        boolean[] isPicked = new boolean[values.length];
        int C = 16;
        int sumV = 0;
        int sumW = 0;
        // default value of boolean array is "false"
        System.out.println(Arrays.toString(isPicked));
        for (int i = 0; i < values.length; i++)
            perW[i] = (double) values[i] / weights[i];
        int k = 0;
        System.out.println(Arrays.toString(perW));
        while (k < values.length && sumW + weights[k] <= C) {
            sumV += values[k];
            sumW += weights[k];
            isPicked[k] = true;
            k++;
        }
        System.out.println("sum value is "
                + sumV + " sum weight is " + sumW);
    }
}