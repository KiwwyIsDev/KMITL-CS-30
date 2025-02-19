package converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        InfixToPostfixConverter converter = new InfixToPostfixConverter();

        System.out.print("Enter infix expression: ");
        String infixExpression = inputScanner.nextLine();

        String postfixExpression = converter.convert(infixExpression);

        System.out.println("\nFinal Postfix Expression: " + postfixExpression);
        inputScanner.close();
    }
}