import java.util.Scanner;
import java.util.Arrays;

public class ProFun08_Q4_670200 {
    public static void main(String[] args) {
        // for first index scanner
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        int[] intArr = new int[loop];

        for (int i = 0; i < loop; i++)
            intArr[i] = sc.nextInt();

        // topK(5, 3, 8, 4, 10, 3, 1, 5, 9, 7, 2);
        // System.out.println(Arr ays.toString(intArr));
        topK(intArr);
        sc.close();
    }

    static void topK(int... data) {
        int[] intArr = new int[10];
        for (int i = 0; i < data.length; i++) {
            int j = 0;
            // topK(5, 3, 8, 4, 10, 3, 1, 5, 9, 7, 2);
            // [8,5,4,3,0,0,0,0,0]
            while (data[i] < intArr[j] && intArr[j] != 0) {
                j++;

            }

            // System.out.println(j);
            if (intArr[j] != 0) {
                for (int k = 9; k > j; k--) {
                    intArr[k] = intArr[k - 1];
                    // System.out.println(k);
                    // System.out.println(Arrays.toString(intArr));
                }

                // System.out.println(10 - j);
            }
            intArr[j] = data[i];

            System.out.println("insert " + data[i] + " -> " + Arrays.toString(intArr));

        }
        System.out.println("final " + Arrays.toString(intArr));

    }

}
