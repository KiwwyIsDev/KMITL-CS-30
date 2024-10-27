import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if (n >= 2  && a > 0 && b > 0 && n <= 100 && a < 100 && b < 100) {
            int normalPrice = n * a;
            int promoPrice = (n / 2) * b + (n % 2) * a;
            int minPrice = Math.min(normalPrice, promoPrice);
            // System.out.print(normalPrice);
            // System.out.println(" " + minPrice);
            // if (minPrice > 0)  {
            //     System.out.println(minPrice);

            // } else {
            //     System.out.println("NO");
            // }
            System.out.println(minPrice);

        } else {
            System.out.println("NO");
        }
    }
}