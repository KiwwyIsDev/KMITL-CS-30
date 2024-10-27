import java.util.Scanner;
public class Lab4Q2670200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price1 = sc.nextInt();
        int price2 = sc.nextInt();
        int price3 = sc.nextInt();
        int amountCharge;
        if (price1 <= price2 && price1 <= price3) {
            amountCharge = price2 + price3;
        } else if (price2 <= price1 && price2 <= price3) {
            amountCharge = price1 + price3;
        } else {
            amountCharge = price1 + price2;
        }
        System.out.println(amountCharge);
        sc.close();
    }
}
