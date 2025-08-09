package Lab05;

import java.util.StringTokenizer;

import Lab05.pack.MyRPN_670200;
import Lab05.pack.MyStackA_670200;

public class Lab05_670200 {
    static void demo_0() {
        MyStackA_670200<Integer> stack = new MyStackA_670200<>();
        for (int i = 1; i < 4; i++)
            stack.push(i);
        System.out.println(stack);
    }
    static void demo_1() {
        String toBeRPN = "8 5 - 4 2 + 3 / *";
        StringTokenizer st = new StringTokenizer(toBeRPN);
        int i = 0;
        String t = "";
        while (st.hasMoreTokens()) {
            t = st.nextToken();
            if (MyRPN_670200.isNumeric(t))
                System.out.println("Token " + i++ + " = " + t);
            else   
                System.out.println("Token " + i++ + " = " + t + " is an operator");
        }
    }
    static void demo_2() {
        String postfixString = "8 5 - 4 2 + 3 / *";
        System.out.println(postfixString + " = " + MyRPN_670200.computeRPN(postfixString));
    }
    public static void main(String[] args) {
        demo_0();
        demo_1();
        demo_2();
    }
}