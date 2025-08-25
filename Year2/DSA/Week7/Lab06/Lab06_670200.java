package Lab06;

import java.util.Iterator;

import Lab06.pack.*;
import Lab05.pack.MyRPN_670200;

public class Lab06_670200 {
    static void task_2() {
        MyQueueL_670200<String> queue = new MyQueueL_670200<>();
        queue.enqueue("Apple");
        queue.enqueue("Banana");
        queue.enqueue("Cantaloupe");
        System.out.print("standard for each: ");
        for (var item : queue) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println("demo iterator");
        Iterator<String> iter = queue.iterator();
        char ch = 'n';
        while (iter.hasNext()) {
            String item = iter.next();
            if (item.indexOf(ch) != -1) {
                System.out.print(item + " ");
            }
        }
        System.out.println();
    }

    static void task_3() { // compute InFix
        String inFix = "( 4 + 2 ) / 3 * ( 8 - 5 )";
        String postFix = MyShuntingYard.infixToPostfix(inFix);
        System.out.println("postFix= " + postFix);
        double ans = MyRPN_670200.computeRPN(postFix);
        System.out.println(ans);
    }

    public static void main(String[] args) {
        // task_2();
        task_3();
    }
}