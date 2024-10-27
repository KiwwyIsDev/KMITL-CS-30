import java.util.Scanner;

public class Lab7Q2_2670200 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str = "PMRQNO";
        // String sub = "QNO";
        String str = sc.next();
        String sub = sc.next();
        sc.close();
        int result = myIndexOf(str, sub);
        System.out.println(result);
    }

    static int myIndexOf(String str, String sub) {
        // System.out.println(str + " " + sub);
        // char first = sub.charAt(0);
        // System.out.println(first);
        for (int i = 0; i < str.length(); i++) {
            // System.out.println(str.charAt(i));
            int offset = 0;
            while (offset < sub.length() && str.charAt(i + offset) == sub.charAt(offset)) {
                offset++;
            }
            if (offset == sub.length()) {
                return i;
            }
        }

        return -1;
    }
}