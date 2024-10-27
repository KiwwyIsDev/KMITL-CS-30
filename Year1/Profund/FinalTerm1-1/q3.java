import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[sc.nextInt()];
        if (a.length >= 0 && a.length < 20) {
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();

            }
        } else {
            System.out.println("[]");
        }
        sc.close();

        // SORT
        selection_sort(a);
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i != a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
    
    static void selection_sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i]; // 2
            int j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;

        }
    }
}
