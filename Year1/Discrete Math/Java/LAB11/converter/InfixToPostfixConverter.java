package converter;

import java.util.Stack;

public class InfixToPostfixConverter {
    public String convert(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        System.out.println("\nConversion Process:\n");
        System.out.println("Step   | Stack              | Postfix Expression");
        System.out.println("------------------------------------------------------------");

        int step = 1;
        for (char ch : infix.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
                printStep(step++, stack, postfix);
            } else if (ch == '(') {
                stack.push(ch);
                printStep(step++, stack, postfix);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                    printStep(step++, stack, postfix);
                }
                stack.pop(); // Remove '(' from stack
                printStep(step++, stack, postfix);
            } else {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    postfix.append(stack.pop());
                    printStep(step++, stack, postfix);
                }
                stack.push(ch);
                printStep(step++, stack, postfix);
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
            printStep(step++, stack, postfix);
        }

        return postfix.toString();
    }

    private int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    private void printStep(int step, Stack<Character> stack, StringBuilder postfix) {
        System.out.printf("Step %2d | Stack: %-15s | Postfix: %s%n", step, stack.toString(), postfix.toString());
    }
}

