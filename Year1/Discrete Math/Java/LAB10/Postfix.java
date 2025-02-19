import java.util.*;

public class Postfix {
    

    public static String infixToPostfix(String infixExpression) {
        StringBuilder postfixExpression = new StringBuilder();
        Stack<Character> operatorStack = new Stack<>();
        Map<Character, Integer> precedence = Map.of('+', 1, '-', 1, '*', 2, '/', 2);
        
        StringTokenizer tokenizer = new StringTokenizer(infixExpression, "()+-*/", true);
        
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken().trim();
            if (token.isEmpty()) continue;
            
            char ch = token.charAt(0);
            if (Character.isDigit(ch)) {
                postfixExpression.append(token).append(" ");
            } else if (ch == '(') {
                operatorStack.push(ch);
            } else if (ch == ')') {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    postfixExpression.append(operatorStack.pop()).append(" ");
                }
                operatorStack.pop();
            } else {
                while (!operatorStack.isEmpty() && precedence.getOrDefault(operatorStack.peek(), 0) >= precedence.getOrDefault(ch, 0)) {
                    postfixExpression.append(operatorStack.pop()).append(" ");
                }
                operatorStack.push(ch);
            }
        }
        
        while (!operatorStack.isEmpty()) {
            postfixExpression.append(operatorStack.pop()).append(" ");
        }
        
        return postfixExpression.toString().trim();
    }
    
    public static int evaluatePostfix(String postfixExpression) {
        Stack<Integer> valueStack = new Stack<>();
        StringTokenizer tokenizer = new StringTokenizer(postfixExpression);
        
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            if (Character.isDigit(token.charAt(0))) {
                valueStack.push(Integer.parseInt(token));
            } else {
                int operand2 = valueStack.pop();
                int operand1 = valueStack.pop();
                switch (token.charAt(0)) {
                    case '+': valueStack.push(operand1 + operand2); break;
                    case '-': valueStack.push(operand1 - operand2); break;
                    case '*': valueStack.push(operand1 * operand2); break;
                    case '/': valueStack.push(operand1 / operand2); break;
                }
            }
        }
        
        return valueStack.pop();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an infix expression: ");
        String infixExpression = scanner.nextLine();
        
        String postfixExpression = infixToPostfix(infixExpression);
        System.out.println("Infix: " + infixExpression);
        System.out.println("Postfix: " + postfixExpression);
        System.out.println("Evaluation Result: " + evaluatePostfix(postfixExpression));
        
        scanner.close();
    }
}
