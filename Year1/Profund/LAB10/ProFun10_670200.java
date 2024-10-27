public class ProFun10_670200 {

    public static int occurrences(int[] a, int n) {
        int count = 0;
        for (int num : a) {
            if (num == n) {
                count++;
            }
        }
        return count;
    }

    public static void negativesToZero(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                a[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 2, 4, 2 };
        int n = 2;
        System.out.println(occurrences(array1, n));

        int[] array2 = { 1, -2, 3, 4, -5 };
        negativesToZero(array2);
        System.out.print("{");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
            if (i < array2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

    }
}
