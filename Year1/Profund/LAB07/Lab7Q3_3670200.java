import java.util.Scanner;

public class Lab7Q3_3670200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str = "PMRQNO";
        // String sub1 = "QN";
        // String sub2 = "MR";
        String str = sc.next();
        String sub1 = sc.next();
        String sub2 = sc.next();
        sc.close();
        boolean result = containsAndBefore(str, sub1, sub2);
        System.out.println(result);
    }

    static boolean containsAndBefore(String str, String sub1, String sub2) {
        int sub1Found = myIndexOf(str, sub1);
        int sub2Found = myIndexOf(str, sub2);
        if (sub1Found != -1 && sub2Found != -1 && sub1Found < sub2Found) {
            return true;
        }
        return false;
    }

    static int myIndexOf(String str, String sub) {
        for (int i = 0; i < str.length(); i++) {
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
