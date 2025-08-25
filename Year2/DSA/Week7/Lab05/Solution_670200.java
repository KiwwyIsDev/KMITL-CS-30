package Lab05;

import java.util.Stack;

public class Solution_670200 {
    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        int i = 0;
        char chr;
        while (i < s.length()) {
            chr = s.charAt(i);
            if (chr == '#') {
                if (!s1.isEmpty()) s1.pop();
            } else {
                s1.push(chr);
            }
            i++;
        }
        i = 0;
        while (i < t.length()) {
            chr = t.charAt(i);
            if (chr == '#') {
                if (!s2.isEmpty()) s2.pop();
            } else {
                s2.push(chr);
            }
            i++;
        }
        return s1.equals(s2);
    }
    
    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c", "ad#c"));
        System.out.println(backspaceCompare("ab##", "c#d###############################"));
        System.out.println(backspaceCompare("a#c", "b"));

    }
}
