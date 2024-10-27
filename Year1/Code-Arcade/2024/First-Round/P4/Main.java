import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() ;
        int b = sc.nextInt();

        int revA = reverseNumber(a);
        int revB = reverseNumber(b);

        int temp = revA;
        revA = revB;
        revB = temp;

        String a_Str = Integer.toString(revA);
        String b_Str = Integer.toString(revB);
        // System.out.println(a_Str + " " + b_Str);
        int lastA = Integer.parseInt(a_Str.substring(a_Str.length() - 1));
        int firstB = Integer.parseInt(b_Str.substring(0,1));
        String test = b_Str.substring(1, b_Str.length());
        // System.out.println(b_Str.length());
        // System.out.println(test);
        // System.out.println(lastA + " " + firstB);
        String c_Str;
        if (lastA + firstB > 9) {
            c_Str = "@" + Integer.toString(((lastA + firstB) % 10));
        } else {
            c_Str = Integer.toString(lastA + firstB);
        }
        System.out.println("" + (revA / 10) + c_Str + test);
        sc.close();
        
    }

    private static int reverseNumber(int number) {
        return Integer.parseInt(new StringBuilder(Integer.toString(number)).reverse().toString());
    }
}
