import java.util.Scanner;

public class nCr {



    static long fact(int n) {
        if(n==0 || n==1) {
            return 1;
        }
        
        long res = 1;
        for (int i = 2; i <= n; i++)
            res = res * i;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input n: ");
        int n = sc.nextInt();

        System.out.print("Input r: ");
        int r = sc.nextInt();
        
        long result = fact(n) / (fact(r) * fact(n - r));
        System.out.println("Result: " + result);
        sc.close();
    }
}