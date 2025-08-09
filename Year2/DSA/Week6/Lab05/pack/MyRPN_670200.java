package Lab05.pack;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class MyRPN_670200{
    private static Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
    public static boolean isNumeric(String strNum) {
        if (strNum == null)
            return false;
        return pattern.matcher(strNum).matches();
    }
    public static double computeRPN(String rpn) {
        MyStackA_670200<Integer> stack = new MyStackA_670200<>();
        StringTokenizer st = new StringTokenizer(rpn);
        String t = "";
        while (st.hasMoreTokens()) {
            t = st.nextToken();
            if (MyRPN_670200.isNumeric(t))
                stack.push(Integer.parseInt(t));
            else {
                int b = stack.pop();
                int a = stack.pop();
                switch (t) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b);
                        break;
                }
            }
                
        }
        return stack.pop();
    }
}