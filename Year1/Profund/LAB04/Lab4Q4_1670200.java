import java.util.Scanner;

public class Lab4Q4_1670200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int count = 0;
        int num = 1;
        while (count < k) {
            int sum = 0;
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (num == sum && num > 0) {
                System.out.println(num);
                count++;
            }
            System.out.println(num);
            num++;
        }
        sc.close();
    }

}
