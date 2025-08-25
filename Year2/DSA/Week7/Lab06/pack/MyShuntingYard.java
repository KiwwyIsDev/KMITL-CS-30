package Lab06.pack;

import java.util.Stack;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class MyShuntingYard {
    private static int order(String c) {
        return switch (c) {
            case "+", "-" -> 1;
            case "*", "/" -> 2;
            default -> 0;
        };
    }

    private static final Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
    public static boolean isNumeric(String strNum) {
        return strNum != null && pattern.matcher(strNum).matches();
    }

    public static String infixToPostfix(String infixString) {
        MyQueueL_670200<String> outputQueue = new MyQueueL_670200<>();
        Stack<String> opStack = new Stack<>();
        StringTokenizer tokenizer = new StringTokenizer(infixString, " ");

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();

            if (isNumeric(token)) {
                outputQueue.enqueue(token);
            } else if ("(".equals(token)) {
                opStack.push(token);
            } else if (")".equals(token)) {
                while (!opStack.isEmpty() && !"(".equals(opStack.peek())) {
                    outputQueue.enqueue(opStack.pop());
                }
                if (!opStack.isEmpty() && "(".equals(opStack.peek())) {
                    opStack.pop();
                }
            } else {
                while (!opStack.isEmpty() && !"(".equals(opStack.peek())
                        && order(token) <= order(opStack.peek())) {
                    outputQueue.enqueue(opStack.pop());
                }
                opStack.push(token);
            }
        }

        while (!opStack.isEmpty()) {
            outputQueue.enqueue(opStack.pop());
        }

        StringBuilder sb = new StringBuilder();
        for (String s : outputQueue) {
            sb.append(s).append(" ");
        }
        return sb.toString().trim();
    }
}
