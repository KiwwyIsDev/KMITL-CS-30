import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        demo1();
    }

    static void demo1() {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[sc.nextInt()];
        if (a.length >= 0 && a.length < 20) {
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
                if (i == 0) {
                    System.out.print("[");
                }
                System.out.print(a[i]);
                if (i != a.length - 1) {
                    System.out.print(", ");
                }

            }
            System.out.print("]");
        } else {
            System.out.println("[]");
        }
        sc.close();
    }

    static void demo2() {

    }
}
