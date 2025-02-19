package classroom;

import java.util.List;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
public class Solution {
    static void sub_01( ){
        // consumer
        List<Integer> lis = Arrays.asList(1,2,3,4,5);
        Consumer<Integer> myPrint = x -> System.out.println(x);
        for (int i = 0; i < lis.size(); i++) {
            myPrint.accept(lis.get(i));
        }
    }

    static void sub_02() {
        Predicate<Integer> p = x -> x % 2 == 0;
        sub_02_callee(p);
    }

    static void sub_02_callee(Predicate<Integer> pred) {
        List<Integer> lis = Arrays.asList(1,2,3,4,5);
        for (int x : lis) {
            if (pred.test(x)) {
                System.out.println(x);
            }
        }
    }
    public static void main(String[] args) {
        // sub_01();
        sub_02();
    }
} 