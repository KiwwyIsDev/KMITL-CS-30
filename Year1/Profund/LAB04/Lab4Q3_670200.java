import java.util.Scanner;
public class Lab4Q3_670200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String wow = sc.nextLine();
        String[] wow2 = wow.split(" ");
        for (int i = 0; i < wow2.length; i++) {
            int num = Integer.parseInt(wow2[i]);
            int cost = 0;
            cost = (num <= 2)? 4: 
            (num <= 4)? 4 + (num - 2) * 3:
            (num <= 24)? Math.min(10 + (num - 4) * 1,24):
            (num / 24) * 24 + ((num % 24 == 0)? 0:
            ((num % 24 <= 2))? 4:
            (num % 24 <= 4)? 4 + (num % 24 - 2) * 3:
            Math.min(10 + (num % 24 - 4)*1, 24 ));
            System.out.printf("parking for %s hrs, pay %s baht.\n",num, cost);

        }
        
        sc.close();
    }
}
